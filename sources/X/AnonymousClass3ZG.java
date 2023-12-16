package X;

import java.util.AbstractMap;
import java.util.Map;

/* renamed from: X.3ZG  reason: invalid class name */
public abstract class AnonymousClass3ZG implements Cloneable {
    public static final C57292tP Companion = new C57292tP();
    public static final AnonymousClass5ZC DEFAULT_SAMPLING_RATE = new AnonymousClass5ZC(1, 20, 20, false);
    public static final int NOT_ALLOWED_PS_ID = -1;
    public final int bufferChannel;
    public final int code;
    public final int psId;
    public final AnonymousClass5ZC samplingRate;

    public AnonymousClass3ZG(int i, AnonymousClass5ZC r3, int i2, int i3) {
        C162457s7.A0J(r3, 2);
        this.code = i;
        this.samplingRate = r3;
        this.bufferChannel = i2;
        this.psId = i3;
    }

    public static AnonymousClass5ZC A04() {
        return new AnonymousClass5ZC(1, 1, 1, false);
    }

    public abstract Map getFieldsMap();

    public abstract void serialize(AnonymousClass4AD r1);

    public static void A0H(Object obj, StringBuilder sb) {
        C57292tP.A00(sb, "messageType", obj);
    }

    public static Integer A05(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 19;
    }

    public static Integer A06(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 20;
    }

    public static Integer A07(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 21;
    }

    public static Integer A08(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 22;
    }

    public static Integer A09(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 23;
    }

    public static Integer A0A(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 24;
    }

    public static Integer A0B(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 26;
    }

    public static Integer A0C(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 27;
    }

    public static Integer A0D(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 28;
    }

    public static Integer A0E(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 29;
    }

    public static Integer A0F(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 30;
    }

    public static String A0G(Object obj, String str, StringBuilder sb) {
        C57292tP.A00(sb, str, obj);
        sb.append("}");
        String obj2 = sb.toString();
        C162457s7.A0D(obj2);
        return obj2;
    }

    public static void A0I(AbstractMap abstractMap, int i) {
        abstractMap.put(Integer.valueOf(i), (Object) null);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }

    public final AnonymousClass5ZC getSamplingRate() {
        return this.samplingRate;
    }

    public static final void appendFieldToStringBuilder(StringBuilder sb, String str, Object obj) {
        C57292tP.A00(sb, str, obj);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnonymousClass3ZG(int i, AnonymousClass5ZC r3, int i2, int i3, int i4, C378924l r7) {
        this(i, (i4 & 2) != 0 ? DEFAULT_SAMPLING_RATE : r3, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? -1 : i3);
    }
}
