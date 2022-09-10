import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static List<String> foodComplimentList = new ArrayList<>();
    public static List<String> foodCycle = new ArrayList<>();
    public static List<String> husbandEmotion = new ArrayList<>();
    public static List<String> womanCompliment = new ArrayList<>();
    public static List<String> womanPart = new ArrayList<>();
    public static List<String> generalEmotions = new ArrayList<>();
    public static List<String> sportList = new ArrayList<>();

    public static void main(String[] args) {

        listInit();
        TextGenerator textGenerator = new TextGenerator();

        System.out.println("\n");
        textGenerator.husbandSentence(randomize(husbandEmotion),
                randomize(foodComplimentList),
                randomize(foodCycle),
                randomize(womanCompliment),
                randomize(womanPart));

        textGenerator.optionalSentence(randomize(generalEmotions),
                randomize(husbandEmotion),
                randomize(womanCompliment),
                randomize(womanPart));

        textGenerator.exactlySentence(randomize(generalEmotions),
                randomize(womanPart));

        textGenerator.dishSentence(randomize(foodComplimentList),
                randomize(womanCompliment),
                randomize(womanPart));

        textGenerator.familySentence(randomize(foodCycle),
                randomize(womanCompliment),
                randomize(womanPart));

        textGenerator.foodSentence(randomize(foodComplimentList),
                randomize(foodComplimentList),
                randomize(womanPart));

        textGenerator.sportSentence(randomize(foodComplimentList),
                randomize(sportList));
    }

    public static void listInit(){

        foodComplimentList.add("���������� ");
        foodComplimentList.add("���������� ");
        foodComplimentList.add("����������� ");
        foodComplimentList.add("������ ");
        foodComplimentList.add("��������� ");
        foodComplimentList.add("������ ");
        foodComplimentList.add("������ ");
        foodComplimentList.add("������� ");
        foodComplimentList.add("������ ");
        foodComplimentList.add("������ ");
        foodComplimentList.add("��������� ");
        foodComplimentList.add("������������ ");

        foodCycle.add("������� ");
        foodCycle.add("���� ");
        foodCycle.add("���� ");

        husbandEmotion.add("������ ");
        husbandEmotion.add("����� � �������� ");
        husbandEmotion.add("�������� ");
        husbandEmotion.add("���������� ");
        husbandEmotion.add("����������� ");
        husbandEmotion.add("������� ");
        husbandEmotion.add("�������� ");

        womanCompliment.add("�������� ");
        womanCompliment.add("�������� ");
        womanCompliment.add("���������������� ");
        womanCompliment.add("������� ");
        womanCompliment.add("������������ ");
        womanCompliment.add("���������� ");
        womanCompliment.add("�������� ");
        womanCompliment.add("��������������� ");
        womanCompliment.add("��������� ");

        womanPart.add("����� ");
        womanPart.add("���� ");
        womanPart.add("������ ");

        generalEmotions.add("������������ ");
        generalEmotions.add("����������� ");
        generalEmotions.add("���������� ");
        generalEmotions.add("������ ");

        sportList.add("��������� ");
        sportList.add("������ ");
        sportList.add("���������� � ����� ");
        sportList.add("��������� ����� ");
        sportList.add("��������� �������� ������� ");
    }

    public static String randomize(List<String> list){
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }
}