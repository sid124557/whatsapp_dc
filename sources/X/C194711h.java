package X;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.11h  reason: invalid class name and case insensitive filesystem */
public final class C194711h extends AnonymousClass09G {
    public C56932sn A00;
    public AnonymousClass4FS A01;
    public boolean A02;
    public final C69263Wi A03;
    public final AnonymousClass1VX A04;
    public final C54872pQ A05;
    public final C632338l A06;
    public final AnonymousClass33O A07;
    public final List A08 = AnonymousClass001.A0s();
    public final AnonymousClass4GQ A09;
    public final AnonymousClass4GR A0A;
    public final AnonymousClass4GR A0B;
    public final AnonymousClass4GS A0C;

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        Log.d("SearchFunStickersAdapter/onCreateViewHolder");
        return new C196712c(C18300x5.A0F(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this);
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r23, int i) {
        float f;
        String str;
        C196712c r3 = (C196712c) r23;
        int i2 = i;
        C18260x0.A0w("SearchFunStickersAdapter/onBindViewHolder/position = ", C18280x3.A0g(r3, 0), i2);
        AnonymousClass26b r9 = (AnonymousClass26b) A0K(i2);
        if (r9 != null) {
            Log.d("SearchFunStickersViewHolder/bind");
            StickerView stickerView = r3.A03;
            stickerView.setVisibility(8);
            stickerView.A03 = true;
            ShimmerFrameLayout shimmerFrameLayout = r3.A02;
            shimmerFrameLayout.setVisibility(0);
            shimmerFrameLayout.A02();
            if (!(r9 instanceof AnonymousClass1UE)) {
                AnonymousClass1UD r92 = (AnonymousClass1UD) r9;
                AnonymousClass39D r4 = r92.A00;
                String str2 = r4.A08;
                AnonymousClass39M r13 = r92.A01;
                if (r92.A03) {
                    stickerView.setEnabled(false);
                    stickerView.setColorFilter(r3.A01);
                    f = 0.4f;
                } else {
                    stickerView.setEnabled(true);
                    stickerView.clearColorFilter();
                    f = 1.0f;
                }
                stickerView.setAlpha(f);
                if (str2 != null && str2.length() != 0) {
                    if (r13 == null) {
                        r3.A04.A0A.invoke(r4, Integer.valueOf(i2));
                        return;
                    }
                    String valueOf = String.valueOf(i + 1);
                    C194711h r6 = r3.A04;
                    String valueOf2 = String.valueOf(r6.A0G());
                    C632338l r0 = r6.A06;
                    if (r0 == null || (str = r0.A02) == null) {
                        str = "";
                    }
                    Context context = stickerView.getContext();
                    Object[] A1X = AnonymousClass0x9.A1X();
                    A1X[0] = valueOf;
                    A1X[1] = valueOf2;
                    stickerView.setContentDescription(C18300x5.A0e(context, str, A1X, 2, R.string.f11nameremoved));
                    stickerView.setOnClickListener(new C109555eo(r6, r92, r13, i2, 1));
                    stickerView.setOnLongClickListener(new C636139y(r6, r92, r13, i2));
                    C18260x0.A0w("SearchFunStickersViewHolder/loadSticker pos=", AnonymousClass001.A0o(), i2);
                    AnonymousClass33O r11 = r6.A07;
                    int i3 = r13.A03;
                    int i4 = i3;
                    r11.A05(stickerView, r13, new AnonymousClass4JR(r3, 0), 1, i4, r13.A02, true, false);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C194711h(C69263Wi r5, AnonymousClass1VX r6, C54872pQ r7, C632338l r8, AnonymousClass33O r9, C56932sn r10, AnonymousClass4FS r11, AnonymousClass4GQ r12, AnonymousClass4GR r13, AnonymousClass4GR r14, AnonymousClass4GS r15) {
        super((AnonymousClass0O4) new AnonymousClass11Y());
        C18260x0.A0V(r6, r5, r11);
        C162457s7.A0J(r7, 4);
        C18260x0.A0T(r10, r9);
        this.A04 = r6;
        this.A03 = r5;
        this.A01 = r11;
        this.A05 = r7;
        this.A00 = r10;
        this.A07 = r9;
        this.A06 = r8;
        this.A09 = r12;
        this.A0C = r15;
        this.A0B = r13;
        this.A0A = r14;
        Log.d("SearchFunStickersAdapter/init");
        int i = 0;
        do {
            this.A08.add(AnonymousClass1UE.A00);
            i++;
        } while (i < 4);
    }
}
