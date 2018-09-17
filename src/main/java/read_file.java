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

                //int value = Integer.parseInt(last);//如果是数值，可以转化为数值
                String [] last_ = last.split(",");
                if(last_.length == 197){
//                    System.out.println("用户编号："+last_[1]);
                    for (String tt:last_
                         ) {
                        System.out.print(tt+" ");
                    }
                }
//                System.out.println("字符串长度"+last_.length);
            }
//            System.out.println("数量："+i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}