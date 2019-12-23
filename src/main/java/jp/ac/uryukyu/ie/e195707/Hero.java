package jp.ac.uryukyu.ie.e195707;

public class Hero extends LivingThing {

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     */
    public Hero(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage  受けたダメージ
     */

    @Override
    public void wounded ( int damage){
        cal_damage(damage);
        if( this.getHitPoint() < 0 ) {
            this.setDead(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", this.getName());
        }
    }

}