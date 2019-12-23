package jp.ac.uryukyu.ie.e195707;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing{

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     */
    public Enemy (String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage  受けたダメージ
     */
    public void wounded(int damage){
        cal_damage(damage);
        if( this.getHitPoint() < 0 ) {
            this.setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", this.getName());
        }
    }

}