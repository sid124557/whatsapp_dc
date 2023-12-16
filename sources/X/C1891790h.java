package X;

import android.view.View;
import android.widget.EditText;
import com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2;
import com.whatsapp.util.Log;

/* renamed from: X.90h  reason: invalid class name and case insensitive filesystem */
public class C1891790h implements View.OnLongClickListener {
    public Object A00;
    public final int A01;

    public C1891790h(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static boolean A00(View view, C1891790h r2) {
        View.OnLongClickListener onLongClickListener = ((C125606Ir) r2.A00).A00;
        if (onLongClickListener != null) {
            return onLongClickListener.onLongClick(view);
        }
        return false;
    }

    public static final boolean A01(C1891790h r2) {
        C91254jE r22 = (C91254jE) r2.A00;
        if (r22.A00 == null) {
            Log.w("CallsHistoryCallItemViewHolder/onContactPhotoLongClicked call item is null");
            return false;
        }
        CallsHistoryFragmentV2 callsHistoryFragmentV2 = r22.A01.A00;
        if (!callsHistoryFragmentV2.A0t) {
            Log.i("callsHistoryFragmentV2/callItemViewHolderEventListener/onSingleContactPhotoLongClicked Ignoring long click");
            return true;
        }
        CallsHistoryFragmentV2.A01(r22, callsHistoryFragmentV2);
        return true;
    }

    public static final boolean A02(C1891790h r2) {
        C91254jE r22 = (C91254jE) r2.A00;
        if (r22.A00 == null) {
            Log.w("CallsHistoryCallItemViewHolder/onMultiContactPhotoLongClicked call item is null");
            return false;
        }
        CallsHistoryFragmentV2 callsHistoryFragmentV2 = r22.A01.A00;
        if (!callsHistoryFragmentV2.A0t) {
            Log.i("callsHistoryFragmentV2/callItemViewHolderEventListener/onSingleContactPhotoLongClicked Ignoring long click");
            return true;
        }
        CallsHistoryFragmentV2.A01(r22, callsHistoryFragmentV2);
        return true;
    }

    public static final boolean A03(C1891790h r2) {
        C91254jE r22 = (C91254jE) r2.A00;
        if (r22.A00 == null) {
            Log.w("CallsHistoryCallItemViewHolder/onViewHolderLongClicked call item is null");
            return false;
        }
        CallsHistoryFragmentV2 callsHistoryFragmentV2 = r22.A01.A00;
        if (!callsHistoryFragmentV2.A0t) {
            Log.i("CallsHistoryFragmentV2/callItemViewHolderEventListener/onViewHolderLongClicked action not supported in the middle of a search");
            return false;
        }
        CallsHistoryFragmentV2.A01(r22, callsHistoryFragmentV2);
        return true;
    }

    public static final boolean A04(C1891790h r1) {
        AnonymousClass5ZS r12 = (AnonymousClass5ZS) r1.A00;
        if (r12.A0Q()) {
            return true;
        }
        r12.A0A();
        return true;
    }

    public final boolean onLongClick(View view) {
        switch (this.A01) {
            case 0:
                return A01(this);
            case 1:
                return A02(this);
            case 2:
                return A03(this);
            case 3:
                return A04(this);
            case 4:
                ((C93314oJ) this.A00).A1F();
                return true;
            case 5:
                return A00(view, this);
            default:
                EditText editText = (EditText) this.A00;
                editText.setSelection(C86624Kv.A03(editText));
                return true;
        }
    }
}
