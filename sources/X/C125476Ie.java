package X;

import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.6Ie  reason: invalid class name and case insensitive filesystem */
public final class C125476Ie extends C05570Ua {
    public final AppCompatCheckBox A00;
    public final WaTextView A01;
    public final /* synthetic */ AnonymousClass4WO A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125476Ie(View view, AnonymousClass4WO r3) {
        super(view);
        C162457s7.A0J(view, 2);
        this.A02 = r3;
        this.A00 = (AppCompatCheckBox) C18280x3.A0E(view, R.id.problem_check_box);
        this.A01 = C86604Kt.A0O(view, R.id.user_problem_text);
    }
}
