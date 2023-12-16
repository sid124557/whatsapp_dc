package X;

/* renamed from: X.3Pu  reason: invalid class name and case insensitive filesystem */
public class C67573Pu implements AnonymousClass4F8 {
    public float A00;
    public final C49922hJ A01;

    public /* bridge */ /* synthetic */ boolean AzC(Object obj) {
        String str = ((C49922hJ) obj).A02;
        C626936e.A06(str);
        return str.equals(this.A01.A02);
    }

    public long B4B() {
        return this.A01.A00;
    }

    public void Bnr(float f) {
        this.A00 = f;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("WeightedRecentStickerIdentifier{");
        stringBuffer.append("stickerIdentifier=");
        stringBuffer.append(this.A01);
        stringBuffer.append(", weight=");
        stringBuffer.append(this.A00);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public C67573Pu(C49922hJ r1, float f) {
        this.A00 = f;
        this.A01 = r1;
    }

    public /* bridge */ /* synthetic */ Object B7y() {
        return this.A01;
    }

    public float BEU() {
        return this.A00;
    }
}
