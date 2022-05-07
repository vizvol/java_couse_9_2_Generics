import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // ученики
        System.out.println("ученики");
        Learner<String> stringLearner = new Learner<>("Sven", "1111111");
        Learner<Integer> integerLearner = new Learner<>("Stiv", 1111111);
        Learner learner = stringLearner.clone();

        System.out.println(stringLearner.getClass().getName() );
        stringLearner.name = "Ivo";
        System.out.println("ученики (Clone/toString)");
        //Clone
        // toString
        System.out.println(stringLearner);
        System.out.println(integerLearner);
        System.out.println(learner);
        // equals
        System.out.println("ученики (equals)");
        System.out.println(stringLearner.equals(integerLearner));
        // hashCode
        System.out.println("ученики (hashCode)");
        System.out.println(stringLearner.hashCode());
        System.out.println(integerLearner.hashCode());
        System.out.println(learner.hashCode());

        // школы
        System.out.println("школы");

        Scool scool  = new Scool("Coddy", stringLearner);
        Scool scool2 = new Scool("Skillbox", integerLearner);
        Scool scool3 = scool.clone();

        System.out.println(scool);
        System.out.println(scool2);
        System.out.println(scool3);

        // equals
        System.out.println("школы (equals)");
        System.out.println(scool.equals(scool2));

        // clone

        System.out.println("школы (clone)");
        scool.name = "Skill Up";
        scool.learner.name = "Tom";
        System.out.println(scool);
        System.out.println(scool2);
        System.out.println(scool3);

        // Generic
        System.out.println("Generic");
        System.out.println(integerLearner.learnId.getClass().getName());
        System.out.println(stringLearner.learnId.getClass().getName());

        // Generic в методах
        System.out.println("Generic в методах");
        Scool scool4 = new Scool("Gymnasium №1", stringLearner);
        System.out.println(printInfo(scool4));
        System.out.println(printInfo(integerLearner));

        // Generic ограничение по интерфейсам
        Teacher<List<String>> listTeacher       = new Teacher<List<String>>();
        Teacher<ArrayList<String>> listTeacher2 = new Teacher<>();

        System.out.println(listTeacher);
        System.out.println(listTeacher2);

    }

    private static<T> T printInfo(T param ){
        return param;
    }
}
