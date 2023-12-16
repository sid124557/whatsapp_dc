package com.whatsapp.extensions.phoenix.view;

import X.AnonymousClass0x2;
import X.AnonymousClass1VX;
import X.AnonymousClass4SH;
import X.AnonymousClass58H;
import X.AnonymousClass66R;
import X.C111095hX;
import X.C154517dI;
import X.C162457s7;
import X.C175728Zm;
import X.C18270x1;
import X.C18290x4;
import X.C18310x6;
import X.C58422vE;
import X.C60482yd;
import X.C624134x;
import X.C66433Lk;
import X.C80603yV;
import X.C85814Hs;
import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public final class PhoenixExtensionsBottomSheetContainer extends Hilt_PhoenixExtensionsBottomSheetContainer {
    public ViewGroup A00;
    public C111095hX A01;
    public ExtensionsInitialLoadingView A02;
    public AnonymousClass1VX A03;
    public C66433Lk A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public final AnonymousClass66R A08 = C154517dI.A00(AnonymousClass58H.NONE, new C80603yV(this));

    public void A0w(Bundle bundle, View view) {
        KeyEvent.Callback callback;
        ExtensionsInitialLoadingView extensionsInitialLoadingView;
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        Dialog dialog = this.A03;
        ViewGroup viewGroup = null;
        if (!(dialog instanceof AnonymousClass4SH) || dialog == null) {
            callback = null;
        } else {
            callback = dialog.findViewById(R.id.design_bottom_sheet);
        }
        if (callback instanceof ViewGroup) {
            viewGroup = (ViewGroup) callback;
        }
        this.A00 = viewGroup;
        UserJid userJid = (UserJid) this.A08.getValue();
        String str = this.A05;
        if (!(userJid == null || str == null || (extensionsInitialLoadingView = this.A02) == null)) {
            extensionsInitialLoadingView.setupFooter(userJid, str);
        }
        Toolbar toolbar = this.A05;
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener(new C85814Hs(this, 1));
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        C18310x6.A1A(this);
        String string = A0H().getString("fds_observer_id");
        if (string != null) {
            C60482yd r2 = this.A0E;
            if (r2 != null) {
                synchronized (r2) {
                    C60482yd.A02.put(string, Boolean.TRUE);
                }
            } else {
                throw C18270x1.A0S("uiObserversFactory");
            }
        }
        super.onDismiss(dialogInterface);
    }

    public void A0c() {
        super.A0c();
        this.A02 = null;
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        AnonymousClass1VX r1 = this.A03;
        if (r1 != null) {
            C58422vE r3 = C58422vE.A02;
            this.A05 = r1.A0R(r3, 2069);
            AnonymousClass1VX r12 = this.A03;
            if (r12 != null) {
                boolean z = false;
                if (r12.A0Y(r3, 4393)) {
                    AnonymousClass1VX r13 = this.A03;
                    if (r13 != null) {
                        String A0R = r13.A0R(r3, 3063);
                        if (A0R != null && C175728Zm.A0S(A0R, "extensions_help", false)) {
                            z = true;
                        }
                    } else {
                        throw C18270x1.A0R();
                    }
                }
                this.A06 = z;
                return;
            }
            throw C18270x1.A0R();
        }
        throw C18270x1.A0R();
    }

    public void A0y(Menu menu, MenuInflater menuInflater) {
        boolean A1Y = AnonymousClass0x2.A1Y(menu, menuInflater);
        super.A0y(menu, menuInflater);
        if (!this.A07) {
            boolean z = this.A06;
            int i = R.string.f11nameremoved;
            if (z) {
                i = R.string.f11nameremoved;
            }
            C18290x4.A1E(menu, -1, i);
            this.A07 = A1Y;
        }
    }

    public boolean A1B(MenuItem menuItem) {
        Uri A032;
        if (C18290x4.A04(menuItem) != -1) {
            return super.A1B(menuItem);
        }
        String str = this.A05;
        if (str == null) {
            return true;
        }
        if (this.A06) {
            A032 = Uri.parse("whatsapp://help/extensions_help");
        } else {
            C66433Lk r0 = this.A04;
            if (r0 != null) {
                A032 = r0.A03(str);
            } else {
                throw C18270x1.A0S("faqLinkFactory");
            }
        }
        C111095hX r2 = this.A01;
        if (r2 != null) {
            r2.BkW(A0G(), A032, (C624134x) null);
            return true;
        }
        throw C18270x1.A0S("activityUtils");
    }
}
