import org.dmg.pmml.FieldName;
import org.dmg.pmml.PMML;
import org.jpmml.evaluator.*;
import org.jpmml.model.PMMLUtil;
import org.xml.sax.SAXException;
import javax.xml.bind.JAXBException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Math.log;


public class ClassificationModel__ {
    private Evaluator modelEvaluator;

    /**
     * 通过传入 PMML 文件路径来生成机器学习模型
     *
     * @param pmmlFileName pmml 文件路径
     */
    public ClassificationModel__(String pmmlFileName) {
        PMML pmml = null;

        try {
            if (pmmlFileName != null) {
                InputStream is = new FileInputStream(pmmlFileName);
                pmml = PMMLUtil.unmarshal(is);
                try {
                    is.close();
                } catch (IOException e) {
                    System.out.println("InputStream close error!");
                }

                ModelEvaluatorFactory modelEvaluatorFactory = ModelEvaluatorFactory.newInstance();

                this.modelEvaluator = (Evaluator) modelEvaluatorFactory.newModelEvaluator(pmml);
                modelEvaluator.verify();
                System.out.println("加载模型成功！");
            }
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    // 获取模型需要的特征名称
    public List<String> getFeatureNames() {
        List<String> featureNames = new ArrayList<String>();

        List<InputField> inputFields = modelEvaluator.getInputFields();

        for (InputField inputField : inputFields) {
            featureNames.add(inputField.getName().toString());
        }
        return featureNames;
    }

    // 获取目标字段名称
    public String getTargetName() {
        return modelEvaluator.getTargetFields().get(0).getName().toString();
    }

    // 使用模型生成概率分布
    private ProbabilityDistribution getProbabilityDistribution(Map<FieldName, ?> arguments) {
        System.out.println(arguments);
        Map<FieldName, ?> evaluateResult = modelEvaluator.evaluate(arguments);
        FieldName fieldName = new FieldName(getTargetName());

        return (ProbabilityDistribution) evaluateResult.get(fieldName);

    }

    // 预测不同分类的概率
    public ValueMap<String, Number> predictProba(Map<FieldName, Number> arguments) {
        ProbabilityDistribution probabilityDistribution = getProbabilityDistribution(arguments);
        return probabilityDistribution.getValues();
    }

    // 预测结果分类
    public Object predict(Map<FieldName, ?> arguments) {
        ProbabilityDistribution probabilityDistribution = getProbabilityDistribution(arguments);

        return probabilityDistribution.getPrediction();
    }

    public static double Prob2Score(double prob,double BasePoint,double PDO,double baseOdds){
        double odds = prob/(1-prob);
        double B = PDO/log(2);
        double A = BasePoint + PDO/log(2)*log(baseOdds);
        double score = A - B *log(odds);
        System.out.println("*********************");
        System.out.println("odds:"+odds);
        System.out.println("log(odds):"+log(odds));
        System.out.println("B:"+B);
        System.out.println("A:"+A);
        System.out.println("*********************");
        return score;
    }

    public static double get_score(Map<String, String> featureNames_){
        ClassificationModel__ clf = new ClassificationModel__("C:\\Users\\juzi\\Desktop\\logist1.pmml");

        List<String> featureNames = clf.getFeatureNames();
        System.out.println("feature: " + featureNames);


        // 构建待预测数据
        Map<FieldName, Number> waitPreSample = new HashMap<>();

        //抽取测试数据并woe处理
//        waitPreSample=process_test_data（featureNames）；


        Map get_var_woe_map = new HashMap();

        get_var_woe_map=featureNames_;

//        Map get_var_woe_map = get_Vars.get_var_woe_Map(featureNames__);

        waitPreSample.put(new FieldName("TX_score_WOE"), ((Number)get_var_woe_map.get("TX_score_WOE")).floatValue());
        waitPreSample.put(new FieldName("TD_Fraud_score_WOE"), ((Number)get_var_woe_map.get("TD_Fraud_score_WOE")).floatValue());
        waitPreSample.put(new FieldName("C_city_x_encoding_WOE"), ((Number)get_var_woe_map.get("C_city_x_encoding_WOE")).floatValue());
        waitPreSample.put(new FieldName("GEO_SCORE_geo104_WOE"), ((Number)get_var_woe_map.get("GEO_SCORE_geo104_WOE")).floatValue());
        waitPreSample.put(new FieldName("huomou_score_WOE"), ((Number)get_var_woe_map.get("huomou_score_WOE")).floatValue());
        waitPreSample.put(new FieldName("sex_age_encoding_WOE"), ((Number)get_var_woe_map.get("sex_age_encoding_WOE")).floatValue());
        waitPreSample.put(new FieldName("match_score_mz_WOE"), ((Number)get_var_woe_map.get("match_score_mz_WOE")).floatValue());
        waitPreSample.put(new FieldName("auth_contactnum_ratio_30d_mz_WOE"), ((Number)get_var_woe_map.get("auth_contactnum_ratio_30d_mz_WOE")).floatValue());
        waitPreSample.put(new FieldName("CDZC003_geo104_WOE"), ((Number)get_var_woe_map.get("CDZC003_geo104_WOE")).floatValue());
        waitPreSample.put(new FieldName("brand_x_encoding_WOE"), ((Number)get_var_woe_map.get("brand_x_encoding_WOE")).floatValue());
        waitPreSample.put(new FieldName("C_app_date_WOE"), ((Number)get_var_woe_map.get("C_app_date_WOE")).floatValue());
        waitPreSample.put(new FieldName("idcard_name_in_gray_mz_WOE"), ((Number)get_var_woe_map.get("idcard_name_in_gray_mz_WOE")).floatValue());
        waitPreSample.put(new FieldName("intercept"), 1);


//        waitPreSample.put(new FieldName("GEO_SCORE_geo104_WOE"), -0.038563617542414795);
//        waitPreSample.put(new FieldName("C_city_x_encoding_WOE"), 0.8471015380646553	);
//        waitPreSample.put(new FieldName("age_x_WOE"), -0.017436831988110593	);
//        waitPreSample.put(new FieldName("CDZC017_geo104_WOE"), 0.5661678942774413	);
//        waitPreSample.put(new FieldName("first_prod_type1_x_encoding_WOE"), 0.14976207438885705);
//        waitPreSample.put(new FieldName("DiffDate_x_WOE"), 0.22009498213271167);
//        waitPreSample.put(new FieldName("brand_x_encoding_WOE"), -1.119865974395296);
//        waitPreSample.put(new FieldName("sex_WOE"), -0.10802302261482663);
//        waitPreSample.put(new FieldName("CDZC009_geo104_encoding_WOE"), -0.6019989565734515	);
//        waitPreSample.put(new FieldName("intercept"), 1);

        int BasePoint = 600;
        int PDO = 50;
        double baseOdds = 0.25;
        double prob = (double) Double.valueOf(String.valueOf(clf.predictProba(waitPreSample).get("1")));

//        prob=0.1583626;

        double score = Prob2Score( prob, BasePoint, PDO, baseOdds);

        return score;
    }

    public static void main(String[] args) {

//        System.out.println("---------------------------------------------------------------------------------------------");
//        for (Map.Entry<FieldName, Number> obj:waitPreSample.entrySet()
//             ) {
//            System.out.println("变量名："+obj.getKey()+"    woe值："+obj.getValue());
//        }
//        System.out.println("---------------------------------------------------------------------------------------------");
//        System.out.println("prob:"+prob);
//        System.out.println("---------------------------------------------------------------------------------------------");

//        double score = get_score();
//        System.out.println("得分：" + score);

    }
}