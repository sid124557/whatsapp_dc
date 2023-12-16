package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaTextView;
import com.whatsapp.polls.PollCreatorViewModel;
import java.util.List;

/* renamed from: X.68o  reason: invalid class name and case insensitive filesystem */
public class C1234768o implements View.OnFocusChangeListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public final void onFocusChange(View view, boolean z) {
        if (this.A02 != 0) {
            A01(this, z);
        } else {
            A00(view, this, z);
        }
    }

    public C1234768o(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public static final void A00(View view, C1234768o r6, boolean z) {
        String A0o;
        C97484yO r3 = (C97484yO) r6.A00;
        PollCreatorViewModel pollCreatorViewModel = (PollCreatorViewModel) r6.A01;
        if (z) {
            WaEditText waEditText = r3.A02;
            waEditText.setSelection(C86624Kv.A03(waEditText));
            if (r3.A01() != -1) {
                int A012 = r3.A01() - 2;
                if (pollCreatorViewModel.A0E(A012) && A012 != pollCreatorViewModel.A00) {
                    C06270Wx.A04(pollCreatorViewModel.A02, AnonymousClass002.A03(pollCreatorViewModel.A0E));
                    pollCreatorViewModel.A00 = A012;
                    pollCreatorViewModel.A0C.A0G(AnonymousClass002.A0D());
                    return;
                }
                return;
            }
            return;
        }
        pollCreatorViewModel.A0G(false);
        if ((view instanceof WaEditText) && r3.A01() != -1) {
            EditText editText = (EditText) view;
            if (editText.getText() == null) {
                A0o = "";
            } else {
                A0o = C86604Kt.A0o(editText);
            }
            int A013 = r3.A01() - 2;
            if (A0o.length() > 0) {
                pollCreatorViewModel.A0F(A0o, A013);
                return;
            }
            List list = pollCreatorViewModel.A0E;
            if (list.size() > 2 && AnonymousClass002.A03(list) != A013) {
                list.remove(A013);
                pollCreatorViewModel.A0D();
            }
        }
    }

    public static final void A01(C1234768o r2, boolean z) {
        int i;
        View view = (View) r2.A01;
        WaTextView waTextView = ((C97474yN) r2.A00).A01;
        Resources A0G = C18290x4.A0G(view);
        if (z) {
            i = AnonymousClass5Yj.A04(view);
        } else {
            i = R.color.f5nameremoved;
        }
        C18320x8.A11(A0G, waTextView, i);
    }
}
