package X;

import com.whatsapp.util.Log;

/* renamed from: X.11Y  reason: invalid class name */
public final class AnonymousClass11Y extends AnonymousClass0O4 {
    public /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2) {
        String str;
        AnonymousClass26b r4 = (AnonymousClass26b) obj;
        AnonymousClass26b r5 = (AnonymousClass26b) obj2;
        C18260x0.A0O(r4, r5);
        Log.d("FunStickerCallback/areItemsTheSame");
        if ((r4 instanceof AnonymousClass1UE) && (r5 instanceof AnonymousClass1UE)) {
            return true;
        }
        if (!(r4 instanceof AnonymousClass1UD) || !(r5 instanceof AnonymousClass1UD)) {
            return false;
        }
        AnonymousClass39M r0 = ((AnonymousClass1UD) r4).A01;
        AnonymousClass39M r2 = ((AnonymousClass1UD) r5).A01;
        String str2 = null;
        if (r0 == null || (str = r0.A0D) == null) {
            return false;
        }
        if (r2 != null) {
            str2 = r2.A0D;
        }
        if (str.equals(str2)) {
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ boolean A00(Object obj, Object obj2) {
        C18260x0.A0O(obj, obj2);
        Log.d("FunStickerCallback/areContentsTheSame");
        return obj.equals(obj2);
    }
}
