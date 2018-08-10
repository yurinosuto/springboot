class PoisonMatango extends Matango{
    int hp = 5;


    public void attack(Hero h) {
        System.out.println("キノコ"　 + this.suffix + "の攻撃");
        System.out.println("10のダメージ");
        h.setHp(h.getHp() - 10);
    }
}

//PoisonMatangoクラスを作成
//PoisonMatango pm = new PoinsonMatango('A');
//int i = 5
//通常のお化けキノコの攻撃、独攻撃が０でなければ追加攻撃、「さらに毒の胞子をばらまいた！」、勇者のHP の１/５ポイントを勇者