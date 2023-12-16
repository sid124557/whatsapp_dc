package X;

import android.content.res.TypedArray;

/* renamed from: X.6NM  reason: invalid class name */
public class AnonymousClass6NM extends C153667bk {
    public AnonymousClass6NM() {
        this.A00.A0F = false;
    }

    public /* bridge */ /* synthetic */ C153667bk A00(TypedArray typedArray) {
        super.A00(typedArray);
        if (typedArray.hasValue(2)) {
            AnonymousClass7QQ r3 = this.A00;
            r3.A05 = (typedArray.getColor(2, r3.A05) & 16777215) | (r3.A05 & -16777216);
        }
        if (typedArray.hasValue(12)) {
            AnonymousClass7QQ r1 = this.A00;
            r1.A09 = typedArray.getColor(12, r1.A09);
        }
        return this;
    }
}
