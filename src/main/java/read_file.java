import org.python.antlr.ast.Str;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.*;

public class read_file {

    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\模型\\风控数据\\test_data.csv"), "GB2312");
            BufferedReader reader = new BufferedReader(isr);
//            BufferedReader reader = new BufferedReader(new FileReader("D:\\模型\\风控数据\\test_data.csv"));//换成你的文件名
            String header = reader.readLine();//第一行信息，为标题信息，不用，如果需要，注释掉
            System.out.println("-----------------header---------------------");
            System.out.println(header);
            String line = null;
            int j = 0;
            while((j < 100 && (line=reader.readLine())!=null)){
                j++;
                String [] item = line.split("，");//CSV格式文件为逗号分隔符文件，这里根据逗号切分
//                String item[] = line.split("，");//CSV格式文件为逗号分隔符文件，这里根据逗号切分
                String last = item[item.length-1];//这就是你要的数据了

                String arg1 = "\"[^男|^女]*?\"";
                Pattern p = Pattern.compile(arg1);
                Matcher m = p.matcher(last);
                StringBuffer sb = new StringBuffer();
                while (m.find()){
                    m.appendReplacement(sb,m.group().replace(",","_").replace("\"",""));
                }
                m.appendTail(sb);
                last = sb.toString();

                String arg2 = "\"[男|女].*\"";
                Pattern p1 = Pattern.compile(arg2);
                Matcher m1 = p1.matcher(last);
                StringBuffer sb1 = new StringBuffer();
                while (m1.find()){
                    m1.appendReplacement(sb1,m1.group().replace(",","_").replace("\"",""));
                }
                m1.appendTail(sb1);
                last = sb1.toString();

                String [] last_ = last.split(",");
                if(last_.length == 197){
//                    System.out.println("cust_id："+last_[1]);
//                    System.out.println("C_city_x："+last_[3]);
//                    System.out.println("brand_x："+last_[4]);
//                    System.out.println("C_app_date："+last_[6]);
//                    System.out.println("GEO_SCORE_geo104："+last_[7]);
//                    System.out.println("CDZC003_geo104："+last_[11]);
//                    System.out.println("gender_mz："+last_[20]);
//                    System.out.println("age_mz："+last_[21]);
//                    System.out.println("idcard_name_in_gray_mz："+last_[36]);
//                    System.out.println("match_score_mz："+last_[102]);
//                    System.out.println("auth_contactnum_ratio_30d_mz："+last_[175]);
//                    System.out.println("huomou_score："+last_[192]);
//                    System.out.println("TX_score："+last_[193]);
//                    System.out.println("TD_Fraud_score："+last_[194]);
//                    System.out.println("sex_age："+last_[195]);
//                    System.out.println("all_score："+last_[196]);
//                    System.out.println("label："+last_[5]);
                    Map<String, String> featureNames = new HashMap();

//                    System.out.println("null"+last_[3].isEmpty());

                    featureNames.put("C_city_x",last_[3].isEmpty()?"NAN":last_[3]);
                    featureNames.put("brand_x",last_[4].toUpperCase().isEmpty()?"NAN":last_[4].toUpperCase());
                    featureNames.put("age",last_[21].isEmpty()?"NAN":last_[21]);
                    featureNames.put("huomou_score",last_[192].isEmpty()?"NAN":last_[192]);
                    featureNames.put("TX_score",last_[193].isEmpty()?"NAN":last_[193]);
                    featureNames.put("TD_Fraud_score",last_[194].isEmpty()?"NAN":last_[194]);
                    featureNames.put("sex",last_[20].isEmpty()?"NAN":last_[20]);
                    featureNames.put("match_score_mz",last_[102].isEmpty()?"NAN":last_[102]);
                    featureNames.put("auth_contactnum_ratio_30d_mz",last_[175].isEmpty()?"NAN":last_[175]);
                    featureNames.put("CDZC003_geo104",last_[11].isEmpty()?"NAN":last_[11]);
                    featureNames.put("GEO_SCORE_geo104",last_[7].isEmpty()?"NAN":last_[7]);
                    featureNames.put("idcard_name_in_gray_mz",last_[36].isEmpty()?"NAN":last_[36]);
                    featureNames.put("C_app_date",last_[6].isEmpty()?"NAN":last_[6]);
                    System.out.println("----------------------输入------------------");
                    System.out.println(featureNames);
                    Map kkk = get_Vars.get_var_woe_Map(featureNames);

                    System.out.println("用户： "+last_[1]+"  最终得分: "+ClassificationModel__.get_score(kkk)+" 对比分： "+last_[196]);

                }
//                System.out.print("\n");
//                System.out.println("字符串长度"+last_.length);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}