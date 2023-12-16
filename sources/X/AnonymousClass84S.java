package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.84S  reason: invalid class name */
public class AnonymousClass84S implements C185318tS {
    public /* bridge */ /* synthetic */ Object Axn(Context context, Object obj, Object obj2, Object obj3) {
        AnonymousClass6N7 r5 = (AnonymousClass6N7) obj;
        AnonymousClass6ND r6 = (AnonymousClass6ND) obj2;
        r5.setOnTouchListener((View.OnTouchListener) null);
        r5.A02 = null;
        View.OnClickListener onClickListener = r6.A06;
        if (onClickListener != null) {
            r5.setOnClickListener(onClickListener);
        }
        r5.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        r5.setFocusable(false);
        r5.setFocusableInTouchMode(false);
        r5.setEnabled(r6.A09);
        if (r6.A00 == -1) {
            return null;
        }
        r5.setClickable(false);
        return null;
    }

    public /* bridge */ /* synthetic */ void BrF(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        AnonymousClass6N7 r4 = (AnonymousClass6N7) obj;
        r4.setOnTouchListener((View.OnTouchListener) null);
        r4.A02 = null;
        r4.setOnClickListener((View.OnClickListener) null);
        r4.setClickable(false);
        r4.setOnLongClickListener((View.OnLongClickListener) null);
        r4.setLongClickable(false);
        r4.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        r4.setFocusable(false);
        r4.setFocusableInTouchMode(false);
    }

    public /* synthetic */ String B6x() {
        return C1443371d.A01(this);
    }

    public /* bridge */ /* synthetic */ boolean Bob(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
