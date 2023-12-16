package com.whatsapp.contact.picker;

import X.AnonymousClass001;
import X.AnonymousClass34K;
import X.AnonymousClass5VS;
import X.AnonymousClass5ZU;
import X.C08310eF;
import X.C109335eS;
import X.C1225564v;
import X.C135166kE;
import X.C18300x5;
import X.C620633i;
import X.C626936e;
import X.C627336j;
import X.C64393Dh;
import X.C64773Ex;
import X.C69263Wi;
import X.C86604Kt;
import X.C86634Kw;
import X.C86644Kx;
import X.C86664Kz;
import X.C95814uZ;
import X.C989053r;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BaseSharedPreviewDialogFragment extends Hilt_BaseSharedPreviewDialogFragment {
    public View A00;
    public View A01;
    public ViewGroup A02;
    public ImageButton A03;
    public LinearLayout A04;
    public LinearLayout A05;
    public RelativeLayout A06;
    public C64393Dh A07;
    public C69263Wi A08;
    public C64773Ex A09;
    public AnonymousClass5ZU A0A;
    public C1225564v A0B;
    public C620633i A0C;
    public EmojiSearchContainer A0D;
    public C989053r A0E;
    public WebPagePreviewView A0F;
    public List A0G;

    public void A0o(Bundle bundle) {
        this.A0X = true;
        Toolbar A0K = C86644Kx.A0K(this.A00);
        C86604Kt.A0z(A0R(), A0K, AnonymousClass34K.A00(A0R()));
        A0K.A0J(A0Q(), R.style.f12nameremoved);
        A0K.setTitle((int) R.string.f11nameremoved);
        C86604Kt.A11(A0Q(), A0K, this.A01, R.drawable.ic_back);
        A0K.setNavigationOnClickListener(new C109335eS(this, 26));
        A0K.setNavigationContentDescription((int) R.string.f11nameremoved);
        Window window = this.A03.getWindow();
        C626936e.A06(window);
        window.clearFlags(67108864);
        window.setStatusBarColor(C18300x5.A03(A0Q(), R.attr.f3nameremoved, R.color.f5nameremoved));
    }

    public void A0g() {
        Dialog dialog = this.A03;
        if (dialog != null) {
            Window window = dialog.getWindow();
            C626936e.A06(window);
            window.setLayout(-1, -1);
            C86644Kx.A17(dialog.getWindow(), -16777216);
            dialog.getWindow().getAttributes().windowAnimations = R.style.f12nameremoved;
        }
        super.A0g();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r0 != 0) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1V() {
        /*
            r3 = this;
            android.widget.RelativeLayout r0 = r3.A06
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r3.A0F
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getVisibility()
            r1 = 2131168229(0x7f070be5, float:1.7950754E38)
            if (r0 == 0) goto L_0x0016
        L_0x0013:
            r1 = 2131168230(0x7f070be6, float:1.7950756E38)
        L_0x0016:
            android.content.res.Resources r0 = X.C08310eF.A09(r3)
            int r1 = r0.getDimensionPixelSize(r1)
            r2.height = r1
            android.widget.RelativeLayout r0 = r3.A06
            int r0 = r0.getHeight()
            if (r1 == r0) goto L_0x002d
            android.widget.RelativeLayout r0 = r3.A06
            r0.setLayoutParams(r2)
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.BaseSharedPreviewDialogFragment.A1V():void");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C1225564v r1 = this.A0B;
        if (r1 != null) {
            ((ContactPicker) r1).A06 = null;
        }
        super.onDismiss(dialogInterface);
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String A012;
        this.A00 = C86634Kw.A0K(this).inflate(R.layout.f8nameremoved, viewGroup, false);
        A13(true);
        A1M(2, 0);
        this.A04 = C86664Kz.A0v(this.A00, R.id.top_layout);
        this.A05 = C86664Kz.A0v(this.A00, R.id.view_placeholder);
        this.A06 = (RelativeLayout) this.A00.findViewById(R.id.footer);
        this.A03 = (ImageButton) this.A00.findViewById(R.id.send);
        this.A02 = C86644Kx.A0J(this.A00, R.id.web_page_preview_container);
        this.A01 = this.A00.findViewById(R.id.link_preview_divider);
        this.A02.setVisibility(8);
        this.A01.setVisibility(8);
        EmojiSearchContainer emojiSearchContainer = (EmojiSearchContainer) this.A00.findViewById(R.id.emoji_search_container);
        this.A0D = emojiSearchContainer;
        emojiSearchContainer.setVisibility(8);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = this.A0G.iterator();
        while (it.hasNext()) {
            C95814uZ A0P = C18300x5.A0P(it);
            if (A0P instanceof C135166kE) {
                A012 = C08310eF.A09(this).getString(R.string.f11nameremoved);
            } else {
                A012 = AnonymousClass5ZU.A01(this.A09, this.A0A, A0P);
            }
            A0s.add(0, A012);
        }
        C86644Kx.A0M(this.A00, R.id.recipients).A0K((List) null, AnonymousClass5VS.A00(this.A0A.A03, A0s, false));
        A1V();
        return this.A00;
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        if (!(A0Q() instanceof C1225564v)) {
            throw new RuntimeException("Activity must implement BaseSharedPreviewDialogFragment.Host");
        }
    }

    public void A0x(Menu menu) {
        menu.findItem(R.id.menuitem_search).setVisible(false);
    }

    public boolean A1B(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        A1K();
        return true;
    }

    public Dialog A1J(Bundle bundle) {
        ArrayList<String> stringArrayList = A0H().getStringArrayList("jids");
        C626936e.A07(stringArrayList, "null jids");
        this.A0G = C627336j.A0B(C95814uZ.class, stringArrayList);
        C1225564v r0 = (C1225564v) A0Q();
        this.A0B = r0;
        if (r0 != null) {
            ((ContactPicker) r0).A06 = this;
        }
        A1M(0, R.style.f12nameremoved);
        return super.A1J(bundle);
    }
}
