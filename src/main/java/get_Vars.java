import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class get_Vars {
//jdbc connect 获取数据


    public static String assign_bin(BigDecimal x, float [] cutOffPoints, float [] special_attribute){
        int numBin = cutOffPoints.length + 1 + special_attribute.length;
        String kk="";
        BigDecimal kkk = BigDecimal.valueOf(-999);
        if(x.compareTo(kkk) == 0){
            kk="Bin -1";
        }else if(x.compareTo(BigDecimal.valueOf(cutOffPoints[0])) <= 0){
            kk="Bin 0";
        }else if(x.compareTo(BigDecimal.valueOf(cutOffPoints[cutOffPoints.length-1]))>0){
            kk="Bin "+(numBin-1);
        }else{
            for(int i=0;i<numBin-2;i++){
                if(BigDecimal.valueOf(cutOffPoints[i]).compareTo(x)<0 && x.compareTo(BigDecimal.valueOf(cutOffPoints[i+1]))<=0){
                    kk="Bin "+(i+1);
                }
            }
        }
        return kk;
    }
//这里将age和sex合并起来
    public static String sex_age_process(String sex, int age){
        String sex1 =sex;
        int age1 =age;
        String sex_age;
        switch(sex1) {
            case "男" :
                // Statements
                if(age1>=18 && age1<=21){
                    sex_age="男,18-21";
                }else if(age1>=22 && age1<26){
                    sex_age="男,22-26";
                }else if(age1>=26 && age1<35){
                    sex_age="男,27-35";
                }else if(age1>=35 && age1<40){
                    sex_age="男,36-40";
                }else{
                    sex_age="男,41+";
                }
                break; // optional

            case "女" :
                // Statements
                if(age1>=18 && age1<=21){
                    sex_age="女,18-21";
                }else if(age1>=22 && age1<26){
                    sex_age="女,22-26";
                }else if(age1>=26 && age1<35){
                    sex_age="女,27-35";
                }else if(age1>=35 && age1<40){
                    sex_age="女,36-40";
                }else{
                    sex_age="女,41+";
                }
                break; // optional

            // You can have any number of case statements.
            default : // Optional
                sex_age="女,41+";
                // Statements
        }
        return sex_age;
    }

    public static Map get_var_woe_Map(){
        Map<String, String> featureNames = new HashMap();
//        featureNames.put("TX_score","72");
//        featureNames.put("TD_Fraud_score","9");
//        featureNames.put("C_city_x","成都市");
//        featureNames.put("GEO_SCORE_geo104","-999");
//        featureNames.put("huomou_score","-999");
//        featureNames.put("sex","女");
//        featureNames.put("age","33");
//        featureNames.put("match_score_mz","61.0960431891342");
//        featureNames.put("auth_contactnum_ratio_30d_mz","0.08474576271186");
//        featureNames.put("CDZC003_geo104","-999");
//        featureNames.put("brand_x","OPPO".toUpperCase());
//        featureNames.put("C_app_date","15");
//        featureNames.put("idcard_name_in_gray_mz","0");

        featureNames.put("C_city_x","金华市");
        featureNames.put("brand_x","Apple".toUpperCase());
        featureNames.put("age","26");
        featureNames.put("huomou_score","641");
        featureNames.put("TX_score","56");
        featureNames.put("TD_Fraud_score","7");
        featureNames.put("sex","男");
        featureNames.put("match_score_mz","90.6425043547156");
        featureNames.put("auth_contactnum_ratio_30d_mz","0.05");
        featureNames.put("CDZC003_geo104","2");
        featureNames.put("GEO_SCORE_geo104","437");
        featureNames.put("idcard_name_in_gray_mz","0");
        featureNames.put("C_app_date","16");

        String sex_age = sex_age_process(featureNames.get("sex"), Integer.valueOf(featureNames.get("age")));

        featureNames.put("sex_age",sex_age);
        featureNames.remove("sex");
        featureNames.remove("age");



        Map br_encoding_map = br_encoding_dict_to_map.get_br_encoding_map();
//        System.out.println(br_encoding_map.keySet());

        Map var_cutoff_M = var_cutoff_dict_to_map.get_var_cutoff_M();
//        System.out.println(var_cutoff_M.keySet());

        Map var_WOE_M = var_WOE_dict_to_map.get_var_woe_M();
//        System.out.println(var_WOE_M.get("sex").toString());
//        System.out.println("------------------转化后----------------------------");
//        Map sex_woe_dict_M = JSON.parseObject(var_WOE_M.get("sex").toString());
//        System.out.println(sex_woe_dict_M.keySet());
        Map result_M = new HashMap();
        for( Map.Entry<String, String> entry: featureNames.entrySet()){
            float [] special_attrib_ = {};
            if(entry.getKey()=="idcard_name_in_gray_mz"){
                Map new_Map = (Map) var_WOE_M.get(entry.getKey());
                if(new_Map.containsKey(entry.getValue())){
                    result_M.put(entry.getKey()+"_WOE",new_Map.get(entry.getValue()));
                }
                else{
                    System.out.println("找不到key");
                }
            }else if(br_encoding_map.containsKey(entry.getKey())){
                Map new_Map = (Map) br_encoding_map.get(entry.getKey());
                if(new_Map.containsKey(entry.getValue())){
//                if(new_Map.containsKey(5)){
//                    result_M.put(entry.getKey()+"_WOE",new_Map.get(entry.getValue()));
                    float [] cutOffPoints_ = (float[]) var_cutoff_M.get(entry.getKey() + "_encoding");

                    for (float item:cutOffPoints_
                    ) {
                        if(item==-999){
                            special_attrib_ = new float[] {-999};
                        }
                    }
                    String assign_bin_ = assign_bin((BigDecimal) new_Map.get(entry.getValue()),cutOffPoints_ ,special_attrib_);
                    Map new_Map_ = (Map) var_WOE_M.get(entry.getKey()+ "_encoding");
                    if(new_Map_.containsKey(assign_bin_)){
                        System.out.println("key:"+entry.getKey()+"****bin no:"+assign_bin_);
                        result_M.put(entry.getKey()+"_encoding_WOE",new_Map_.get(assign_bin_));
                    }else{

                        System.out.println(entry.getKey()+"*************var_WOE_M找不到Bin key 或者assign_bin错误:"+assign_bin_);
                    }
                }
                else{
                    System.out.println("value:"+entry.getValue()+"keyset:"+new_Map.keySet());
                    System.out.println(entry.getKey()+"-------------------br_encoding_map: key：values{}中 找不到entry.value");
                }
            }else if(var_cutoff_M.containsKey(entry.getKey())){
                float [] cutOffPoints_ = (float[]) var_cutoff_M.get(entry.getKey());
                for (float item:cutOffPoints_
                ) {
                    if(item==-999){
                        special_attrib_ = new float[] {-999};
                    }
                }
                float floatValue = Float.parseFloat(entry.getValue());
                BigDecimal floatValue1 = BigDecimal.valueOf(floatValue);
                String assign_bin_ = assign_bin(floatValue1,cutOffPoints_ ,special_attrib_);
                Map new_Map_ = (Map) var_WOE_M.get(entry.getKey());
                if(new_Map_.containsKey(assign_bin_)){
                    System.out.println("key:"+entry.getKey()+"  ---****---  bin no:"+assign_bin_);
                    result_M.put(entry.getKey()+"_WOE",new_Map_.get(assign_bin_));
                }else{
                    System.out.println(entry.getKey()+"0000000000000var_WOE_M找不到Bin key 或者assign_bin错误:"+assign_bin_);
                }

            }else{
                System.out.println(entry.getKey()+":"+entry.getValue()+"pppppppppppp在各个字典找不到 找不到key");
            }

        }

        return result_M;
    }

    public static void main(String [] args){
        Map kkk = get_var_woe_Map();
        System.out.println(kkk);

    }



}
