package X;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;

/* renamed from: X.0dS  reason: invalid class name and case insensitive filesystem */
public class C08180dS implements InputConnectionCompat.OnCommitContentListener {
    public final /* synthetic */ View A00;

    public C08180dS(View view) {
        this.A00 = view;
    }

    public boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                inputContentInfoCompat.requestPermission();
                InputContentInfo inputContentInfo = (InputContentInfo) inputContentInfoCompat.mImpl.getInputContentInfo();
                if (bundle == null) {
                    bundle = AnonymousClass002.A08();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable(InputConnectionCompat.EXTRA_INPUT_CONTENT_INFO, inputContentInfo);
            } catch (Exception e) {
                Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        if (C06560Yg.A04(this.A00, AnonymousClass0KM.A00(bundle, inputContentInfoCompat)) == null) {
            return true;
        }
        return false;
    }
}
