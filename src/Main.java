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

        foodComplimentList.add("Освежающий ");
        foodComplimentList.add("Насыщенный ");
        foodComplimentList.add("Питательный ");
        foodComplimentList.add("Пряный ");
        foodComplimentList.add("Пикантный ");
        foodComplimentList.add("Нежный ");
        foodComplimentList.add("Сочный ");
        foodComplimentList.add("Вкусный ");
        foodComplimentList.add("Легкий ");
        foodComplimentList.add("Сытный ");
        foodComplimentList.add("Ароматный ");
        foodComplimentList.add("Великолепный ");

        foodCycle.add("Завтрак ");
        foodCycle.add("Обед ");
        foodCycle.add("Ужин ");

        husbandEmotion.add("Оценит ");
        husbandEmotion.add("Будет в восторге ");
        husbandEmotion.add("Удивится ");
        husbandEmotion.add("Обрадуется ");
        husbandEmotion.add("Впечатлится ");
        husbandEmotion.add("Полюбит ");
        husbandEmotion.add("Влюбится ");

        womanCompliment.add("Стройная ");
        womanCompliment.add("Красивая ");
        womanCompliment.add("Сногсшибательная ");
        womanCompliment.add("Изящная ");
        womanCompliment.add("Великолепная ");
        womanCompliment.add("Подтянутая ");
        womanCompliment.add("Шикарная ");
        womanCompliment.add("Привлекательная ");
        womanCompliment.add("Пикантная ");

        womanPart.add("Ножки ");
        womanPart.add("Тело ");
        womanPart.add("Фигура ");

        generalEmotions.add("Удовольствие ");
        generalEmotions.add("Наслаждение ");
        generalEmotions.add("блаженство ");
        generalEmotions.add("Услада ");

        sportList.add("Стройнеть ");
        sportList.add("Худеть ");
        sportList.add("Оставаться в форме ");
        sportList.add("Сохранять форму ");
        sportList.add("Соблюдать здоровое питание ");
    }

    public static String randomize(List<String> list){
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }
}