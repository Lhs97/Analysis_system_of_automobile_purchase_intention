package TextUnvaluable;
import java.util.ArrayList;
/**
 * @author lihuaishan @date 2020/2/23 - 23:23
 */
public class TemplateTest {
    public static void main(String[] args) {
        int i = 5;
        System.out.println();
        //模板一: psvm  main方法()
        //模板二: sout   输出
        //变形:soutv soutp soutm xxx.sout
        System.out.println("i = " + i);
        //模板三:fori
        for (int j = 0; j <5; j++) {

        }
        //变形:iter
        for (String s : args) {

        }
        //变形itar
        for (int defination = 0; defination < args.length; defination++) {
            String arg = args[defination];

        }
        //模板四:list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {
            
        }
        //变形:list.fori
        for (int i1 = 0; i1 < list.size(); i1++) {
            
        }
        //变形:list.forr
        for (int i1 = list.size() - 1; i1 >= 0; i1--) {
            
        }
        //模板五:ifn
        if (list == null) {
            
        }
        //变形:inn
        if (list != null) {
            
        }
    }
        //模板六:prsf: private static final

    public  void menthod(){
        System.out.println("TemplateTest.menthod");
    }
    /**
    *客户信息
    *
    */
    private int  costomser = 6;
}
