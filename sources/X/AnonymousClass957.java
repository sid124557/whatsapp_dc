package X;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import java.util.List;
import java.util.Map;

/* renamed from: X.957  reason: invalid class name */
public class AnonymousClass957 extends AnonymousClass0R6 {
    public final C152967aS A00;
    public final C620733j A01;
    public final AnonymousClass39S A02;
    public final Map A03 = AnonymousClass001.A0t();

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new AnonymousClass95Q(C86604Kt.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false), this.A00);
        }
        if (i == 1) {
            return new AnonymousClass95X(C86604Kt.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false));
        }
        throw AnonymousClass001.A0e(AnonymousClass000.A0Y("Unsupported view type - ", AnonymousClass001.A0o(), i));
    }

    public int A0G() {
        return this.A02.A07.A09.size() + 1;
    }

    public void BNf(C05570Ua r26, int i) {
        String str;
        String str2;
        C05570Ua r10 = r26;
        AnonymousClass39S r6 = this.A02;
        AnonymousClass39H r2 = r6.A07;
        List list = r2.A09;
        int i2 = i;
        if (i2 < list.size()) {
            AnonymousClass39F r7 = (AnonymousClass39F) list.get(i2);
            AnonymousClass95Q r102 = (AnonymousClass95Q) r10;
            C620733j r9 = this.A01;
            C108815db r12 = (C108815db) this.A03.get(r7.A00());
            AnonymousClass39G r8 = r7.A01;
            long j = r8.A01;
            int i3 = r7.A00;
            String A06 = r6.A06(r9, new AnonymousClass39G(j * ((long) i3), r8.A00, r8.A02));
            WaImageView waImageView = r102.A00;
            Resources A0G = C18290x4.A0G(waImageView);
            r102.A03.setText(r7.A03);
            WaTextView waTextView = r102.A02;
            Object[] A0L = AnonymousClass002.A0L();
            AnonymousClass000.A1L(A0L, i3);
            waTextView.setText(A0G.getString(R.string.f11nameremoved, A0L));
            r102.A01.setText(A06);
            if (r12 == null) {
                waImageView.setImageDrawable(new ColorDrawable(A0G.getColor(R.color.f5nameremoved)));
            } else {
                r102.A04.A02(waImageView, r12, (C181758nH) null, new C195129Wd(1), 2);
            }
        } else {
            AnonymousClass95X r103 = (AnonymousClass95X) r10;
            C620733j r13 = this.A01;
            AnonymousClass39G r4 = r2.A06;
            String A062 = r6.A06(r13, r4);
            AnonymousClass39G r3 = r2.A03;
            String A063 = r6.A06(r13, r3);
            AnonymousClass39G r5 = r2.A04;
            String A064 = r6.A06(r13, r5);
            String A065 = r6.A06(r13, r2.A05);
            String A05 = r6.A05(r13);
            String str3 = null;
            if (r4 == null) {
                str = null;
            } else {
                str = r4.A02;
            }
            if (r3 == null) {
                str2 = null;
            } else {
                str2 = r3.A02;
            }
            if (r5 != null) {
                str3 = r5.A02;
            }
            if (!TextUtils.isEmpty(A062) || !TextUtils.isEmpty(A063) || !TextUtils.isEmpty(A064)) {
                r103.A07(0);
                r103.A08(r103.A05, r103.A06, r13, (String) null, A065, R.string.f11nameremoved);
                r103.A08(r103.A07, r103.A08, r13, str, A062, R.string.f11nameremoved);
                r103.A08(r103.A01, r103.A02, r13, str2, A063, R.string.f11nameremoved);
                r103.A08(r103.A03, r103.A04, r13, str3, A064, R.string.f11nameremoved);
            } else {
                r103.A07(8);
            }
            r103.A09.setText(A05);
        }
    }

    public int getItemViewType(int i) {
        return AnonymousClass000.A1U(i, this.A02.A07.A09.size()) ? 1 : 0;
    }

    public AnonymousClass957(C152967aS r2, C620733j r3, AnonymousClass39S r4) {
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
    }
}
