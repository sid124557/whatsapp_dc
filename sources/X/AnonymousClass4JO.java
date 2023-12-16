package X;

/* renamed from: X.4JO  reason: invalid class name */
public class AnonymousClass4JO implements AnonymousClass4BH {
    public Object A00;
    public final int A01;

    public AnonymousClass4JO(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public AnonymousClass5OE B06(int i) {
        switch (this.A01) {
            case 0:
                AnonymousClass4JO r2 = this;
                return new AnonymousClass5OE((AnonymousClass4FV) ((C118075sx) r2.A00).A03.ASY.get(), ((C118075sx) r2.A00).A03.A00.ANk(), i);
            case 1:
                AnonymousClass4JO r22 = this;
                return new AnonymousClass5OE((AnonymousClass4FV) ((C118065sw) r22.A00).A02.ASY.get(), ((C118065sw) r22.A00).A02.A00.ANk(), i);
            default:
                return null;
        }
    }
}
