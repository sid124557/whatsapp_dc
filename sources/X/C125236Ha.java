package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.math.BigDecimal;
import java.util.List;

/* renamed from: X.6Ha  reason: invalid class name and case insensitive filesystem */
public final class C125236Ha extends AnonymousClass0R6 {
    public int A00;
    public final C54292oU A01;
    public final C620733j A02;
    public final List A03 = AnonymousClass001.A0s();

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        View inflate = C86604Kt.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false);
        C162457s7.A0D(inflate);
        return new C125566In(inflate, this.A01, this.A02);
    }

    public int A0G() {
        return this.A03.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r9, int i) {
        AnonymousClass39Q r0;
        BigDecimal bigDecimal;
        C125566In r92 = (C125566In) r9;
        C162457s7.A0J(r92, 0);
        AnonymousClass7LE r5 = (AnonymousClass7LE) this.A03.get(i);
        C162457s7.A0J(r5, 0);
        C632538n r7 = r5.A01;
        AnonymousClass39L r02 = r7.A01;
        String str = null;
        if (!(r02 == null || (r0 = r02.A02) == null || (bigDecimal = r0.A00) == null)) {
            C85204Fi r1 = AnonymousClass1S3.A04;
            C626936e.A06(r1);
            str = r1.B3W(r92.A03, bigDecimal);
        }
        TextEmojiLabel textEmojiLabel = r92.A01;
        C54292oU r3 = r92.A02;
        Object[] A0M = AnonymousClass002.A0M();
        C18280x3.A19(Integer.valueOf(r7.A00), str, A0M);
        textEmojiLabel.setText(r3.A09(R.string.f11nameremoved, A0M));
        r92.A00.setChecked(r5.A02);
        r92.A0H.setOnClickListener(new C109485eh(r5, 49, r92));
    }

    public C125236Ha(C54292oU r2, C620733j r3) {
        this.A02 = r3;
        this.A01 = r2;
    }
}
