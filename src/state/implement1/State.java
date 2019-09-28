package state.implement1;

public interface State {
    // 投入25分钱
    void insertQuarter();

    // 退回25分钱
    void ejectQuarter();

    // 转动曲柄
    void turnkCrank();

    // 发放饮料
    void dispense();
}
