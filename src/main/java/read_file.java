import org.python.antlr.ast.Str;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.*;

public class read_file {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\模型\\风控数据\\test_data.csv"));//换成你的文件名
            String header = reader.readLine();//第一行信息，为标题信息，不用，如果需要，注释掉
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
                if(last_.length != 197){
                    System.out.println("用户编号："+last_[1]);
                    for (String tt:last_
                         ) {
                        System.out.print(tt+" ");
                    }
                }
                System.out.print("\n");
                System.out.println("字符串长度"+last_.length);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}