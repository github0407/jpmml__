import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Math.log;

public class examt {

    public void select_var(){

    }
//wuha wuha wuha wuha
    public static void main (String [] args){
        List<String> featureNames = new ArrayList<String>();
//        ["GEO_SCORE_geo104_WOE","C_city_x_encoding_WOE","age_x_WOE","CDZC017_geo104_WOE","first_prod_type1_x_encoding_WOE","DiffDate_x_WOE","brand_x_encoding_WOE","sex_WOE","CDZC009_geo104_encoding_WOE","intercept"]
        featureNames.add("GEO_SCORE_geo104_WOE");
        featureNames.add("C_city_x_encoding_WOE");
        featureNames.add("age_x_WOE");
        featureNames.add("CDZC017_geo104_WOE");
        featureNames.add("first_prod_type1_x_encoding_WOE");
        featureNames.add("DiffDate_x_WOE");
        featureNames.add("brand_x_encoding_WOE");
        featureNames.add("sex_WOE");
        featureNames.add("CDZC009_geo104_encoding_WOE");
        featureNames.add("intercept");

        Map features_M = new HashMap();
        List<String> features_M1 = new ArrayList<String>();
        List<String> features_M2 = new ArrayList<String>();

        for (String obj : featureNames
        ) {
            if(obj.endsWith("_encoding_WOE")){
                features_M1.add(obj);
            }else if (obj != "intercept"){
                features_M2.add(obj);
            }
//            System.out.println("各变量为："+obj);
        }
        features_M.put("_encoding_WOE",features_M1);
        features_M.put("_WOE",features_M2);

        System.out.println("features_M:"+features_M);

        String str = "GEO_SCORE_geo104_WOE";
//        str.replace("_WOE","");
        String str2 = str.replace("_WOE", "");

        System.out.println("log(2):"+log(2));

        System.out.println(str2);
    }
}
