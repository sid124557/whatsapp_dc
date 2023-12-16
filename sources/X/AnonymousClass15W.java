package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.util.List;

/* renamed from: X.15W  reason: invalid class name */
public class AnonymousClass15W extends AnonymousClass4SH {
    public View A00;
    public AnonymousClass1Hk A01;
    public final AnonymousClass08M A02 = AnonymousClass08M.A01();
    public final C56492s4 A03;
    public final C47892e0 A04;
    public final C105845Wq A05;
    public final C104175Py A06;
    public final C40352Fm A07;
    public final AnonymousClass2TX A08;
    public final C195511q A09 = new C195511q(new AnonymousClass4H0(1));
    public final C95814uZ A0A;
    public final C106685Zz A0B;
    public final C56072rN A0C;

    public AnonymousClass15W(Context context, C56492s4 r4, C47892e0 r5, C105845Wq r6, C104175Py r7, C40352Fm r8, AnonymousClass2TX r9, C95814uZ r10, C106685Zz r11, C56072rN r12) {
        super(context, R.style.f12nameremoved);
        this.A0A = r10;
        this.A0B = r11;
        this.A03 = r4;
        this.A0C = r12;
        this.A08 = r9;
        this.A06 = r7;
        this.A07 = r8;
        this.A05 = r6;
        this.A04 = r5;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f8nameremoved);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass0HG.A00(this, R.id.questions_view);
        getContext();
        C18320x8.A19(recyclerView, 1);
        C195511q r7 = this.A09;
        recyclerView.setAdapter(r7);
        C129486aO r6 = new C129486aO();
        AnonymousClass2TX r2 = this.A08;
        for (C48492ez r4 : r2.A08) {
            r6.add((Object) new AnonymousClass2O0(this.A02, r4));
        }
        C129586aY build = r6.build();
        AnonymousClass2R1 r5 = r7.A00;
        int i = r5.A00 + 1;
        r5.A00 = i;
        C129586aY r72 = r5.A01;
        if (build != r72) {
            if (build == null) {
                if (r72 != null) {
                    int size = r72.size();
                    r5.A01 = null;
                    r5.A03.BZo(0, size);
                }
            } else if (r72 == null) {
                r5.A01 = build;
                r5.A03.BUd(0, build.size());
            }
            r5.A02.A01.execute(new C71433c6(r5, build, r72, i, 12));
        }
        View A002 = AnonymousClass0HG.A00(this, R.id.send_button);
        this.A00 = A002;
        C633839a.A00(A002, this, 1);
        C633839a.A00(AnonymousClass0HG.A00(this, R.id.close), this, 0);
        this.A01 = new AnonymousClass1Hk(this.A03, this.A0B, this.A04.A01(this.A05, r2));
        WebPagePreviewView webPagePreviewView = (WebPagePreviewView) AnonymousClass0HG.A00(this, R.id.web_page_preview);
        webPagePreviewView.A0F(this.A01, (List) null, false, this.A0C.A01());
        View findViewById = webPagePreviewView.findViewById(R.id.link_preview_content);
        if (findViewById != null) {
            findViewById.setBackgroundResource(R.drawable.round_corner_icebreaker_link_preview_background);
        }
        Drawable A012 = C06130Wj.A01(C18310x6.A0G(getContext(), R.drawable.balloon_incoming_frame).mutate());
        AnonymousClass0YG.A06(A012, AnonymousClass0Y8.A04(getContext(), AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved)));
        webPagePreviewView.setForeground(A012);
        this.A02.A0E(new AnonymousClass4K2(this, 89));
        View A003 = AnonymousClass0HG.A00(this, R.id.design_bottom_sheet);
        BottomSheetBehavior A013 = BottomSheetBehavior.A01(A003);
        A013.A0S(3);
        A013.A0p = true;
        A013.A0R(A003.getHeight());
        this.A06.A00(3, this.A0A.getRawString(), true);
    }
}
