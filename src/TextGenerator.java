public class TextGenerator {

    public void husbandSentence(String husbandEmotion, String compliment, String foodCycle, String womanCompliment, String womanPart){
        System.out.println("��� " + husbandEmotion + compliment + foodCycle + "� ���� " + womanCompliment + womanPart);
    }

    public void optionalSentence(String generalEmotion, String husbandEmotion, String womanEmotion, String womanPart){
        System.out.println("��� � " + generalEmotion + ", ���� ������ " + husbandEmotion + "����� " + womanEmotion + womanPart);
    }

    public void exactlySentence(String generalEmotion, String womanPart){
        System.out.println("��� ����� ������, ����� ����� " + generalEmotion + "������ ��� ����� ��� " + womanPart);
    }

    public void dishSentence(String foodCompliment, String womanCompliment, String womanPart){
        System.out.println("'�������� �����' �� ������: ������ ��������, ��� �������� ��� "
                + foodCompliment + "����� � " + womanCompliment + womanPart);
    }

    public void familySentence(String foodCycle, String womanCompliment, String womanPart){
        System.out.println("���� " + foodCycle + "�� ������� ��������� ��� ����� �� � �����, �� ��� � ��������� " + womanCompliment + womanPart);
    }

    public void foodSentence(String foodCompliment, String foodComplimentS, String womanPart){
        System.out.println(foodCompliment + foodComplimentS + "'��� �����' �����, �������������� � ������� ��� ����� " + womanPart);
    }

    public void sportSentence(String foodCompliment, String sportAction){
        System.out.println("��� ������ ������� ����, ��� " + foodCompliment + "�������� � " + sportAction + "��� �������!");
    }

}
