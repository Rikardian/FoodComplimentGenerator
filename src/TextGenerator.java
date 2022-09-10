public class TextGenerator {

    public void husbandSentence(String husbandEmotion, String compliment, String foodCycle, String womanCompliment, String womanPart){
        System.out.println("Муж " + husbandEmotion + compliment + foodCycle + "и твои " + womanCompliment + womanPart);
    }

    public void optionalSentence(String generalEmotion, String husbandEmotion, String womanEmotion, String womanPart){
        System.out.println("Ешь с " + generalEmotion + ", пока другие " + husbandEmotion + "твоей " + womanEmotion + womanPart);
    }

    public void exactlySentence(String generalEmotion, String womanPart){
        System.out.println("Тот самый случай, когда можно " + generalEmotion + "вкусом без вреда для " + womanPart);
    }

    public void dishSentence(String foodCompliment, String womanCompliment, String womanPart){
        System.out.println("'Название блюда' по новому: сейчас расскажу, что добавить для "
                + foodCompliment + "вкуса и " + womanCompliment + womanPart);
    }

    public void familySentence(String foodCycle, String womanCompliment, String womanPart){
        System.out.println("Этим " + foodCycle + "ты успеешь накормить всю семью за Х минут, да еще и сохранишь " + womanCompliment + womanPart);
    }

    public void foodSentence(String foodCompliment, String foodComplimentS, String womanPart){
        System.out.println(foodCompliment + foodComplimentS + "'Тип блюда' блюдо, приготовленное с пользой для твоей " + womanPart);
    }

    public void sportSentence(String foodCompliment, String sportAction){
        System.out.println("Наш проект покажет тебе, что " + foodCompliment + "питаться и " + sportAction + "это реально!");
    }

}
