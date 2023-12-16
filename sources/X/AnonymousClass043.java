package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.whatsapp.R;

/* renamed from: X.043  reason: invalid class name */
public class AnonymousClass043 extends AnonymousClass00Q implements DialogInterface {
    public final C06200Wq A00 = new C06200Wq(getContext(), getWindow(), this);

    public static int A00(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.f3nameremoved, typedValue, true);
        return typedValue.resourceId;
    }

    public void A03(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        C06200Wq r2 = this.A00;
        Message obtainMessage = r2.A08.obtainMessage(i, onClickListener);
        if (i == -3) {
            r2.A0O = charSequence;
            r2.A0A = obtainMessage;
        } else if (i != -2) {
            r2.A0P = charSequence;
            r2.A0B = obtainMessage;
        } else {
            r2.A0N = charSequence;
            r2.A09 = obtainMessage;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A00.A0M;
        if (nestedScrollView == null || !nestedScrollView.A0C(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A00.A0M;
        if (nestedScrollView == null || !nestedScrollView.A0C(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public AnonymousClass043(Context context, int i) {
        super(context, A00(context, i));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A00.A03();
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C06200Wq r0 = this.A00;
        r0.A0R = charSequence;
        TextView textView = r0.A0L;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
