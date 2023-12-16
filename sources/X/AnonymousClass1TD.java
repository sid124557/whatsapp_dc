package X;

import java.util.Arrays;

/* renamed from: X.1TD  reason: invalid class name */
public final class AnonymousClass1TD extends AnonymousClass26S {
    public final int[] A00;

    public AnonymousClass1TD(int[] iArr) {
        C162457s7.A0J(iArr, 1);
        this.A00 = iArr;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<AnonymousClass1TD> cls2 = AnonymousClass1TD.class;
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (cls2.equals(cls)) {
                C162457s7.A0K(obj, "null cannot be cast to non-null type com.whatsapp.expressionstray.ExpressionsSideEffects.EmojiSelected");
                if (!Arrays.equals(this.A00, ((AnonymousClass1TD) obj).A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EmojiSelected(emoji=");
        return C18260x0.A07(Arrays.toString(this.A00), A0o);
    }
}
