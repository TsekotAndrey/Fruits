import java.util.HashMap;

public class Phrases {
    String welcomePhrase;
    String firstPhrasePos;
    String firstPhraseNeg;
    String secondPhrasePos;
    String secondPhraseNeg;
    String thirdPhrasePos;
    String thirdPhraseNeg;
    String finalPhrasePos;
    String finalPhraseNeg;

    Phrases() {
        HashMap<String, String> map = new HashMap<>();
        map.put("welcomePhrase", "Добро пожаловать в игру. Есть 3 попытки отгадать буквы в этом слове. Введите любую букву! На англ. и малые буквы.");
        map.put("firstPhrasePos", "Эта буква есть в слове. Еще у тебя две попытки. Вводи букву!");
        map.put("firstPhraseNeg", "Этой буквы нет в слове. Еще у тебя две попытки. Вводи букву!");
        map.put("secondPhrasePos", "Эта буква есть в слове. Еще у тебя одна попытка. Вводи букву!");
        map.put("secondPhraseNeg", "Этой буквы нет в слове. Еще у тебя одна попытка. Вводи букву!");
        map.put("thirdPhrasePos", "Эта буква есть в слове. Теперь вводи все слово целиком!");
        map.put("thirdPhraseNeg", "Этой буквы нет в слове. Теперь вводи все слово целиком!");
        map.put("finalPhrasePos", "Ура Ура Ура! Пробуй снова и отгадай все слова.");
        map.put("finalPhraseNeg", "Неудача! Пробуй снова и отгадай все слова");

        this.welcomePhrase = map.get("welcomePhrase");
        this.firstPhrasePos = map.get("firstPhrasePos");
        this.firstPhraseNeg = map.get("firstPhraseNeg");
        this.secondPhrasePos = map.get("secondPhrasePos");
        this.secondPhraseNeg = map.get("secondPhraseNeg");
        this.thirdPhrasePos = map.get("thirdPhrasePos");
        this.thirdPhraseNeg = map.get("thirdPhraseNeg");
        this.finalPhrasePos = map.get("finalPhrasePos");
        this.finalPhraseNeg = map.get("finalPhraseNeg");

    }

    public String getWelcomePhrase() {
        return this.welcomePhrase;
    }
    public String getFirstPhrasePos() {
        return this.firstPhrasePos;
    }
    public String getFirstPhraseNeg() {
        return this.firstPhraseNeg;
    }
    public String getSecondPhrasePos() {
        return this.secondPhrasePos;
    }
    public String getSecondPhraseNeg() {
        return this.secondPhraseNeg;
    }
    public String getThirdPhrasePos() {
        return this.thirdPhrasePos;
    }
    public String getThirdPhraseNeg() {
        return this.thirdPhraseNeg;
    }
    public String getFinalPhrasePos() {
        return this.finalPhrasePos;
    }
    public String getFinalPhraseNeg() {
        return this.finalPhraseNeg;
    }


}


