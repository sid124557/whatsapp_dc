package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass5Vo;
import X.AnonymousClass9XA;
import X.C08240dc;
import X.C08270df;
import X.C08310eF;
import X.C160757oG;
import X.C18290x4;
import android.animation.LayoutTransition;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class PaymentBottomSheet extends Hilt_PaymentBottomSheet {
    public DialogInterface.OnCancelListener A00;
    public DialogInterface.OnDismissListener A01;
    public C08310eF A02;
    public AnonymousClass9XA A03 = new AnonymousClass9XA();
    public C160757oG A04 = C160757oG.A00("PaymentBottomSheet", "payment", "COMMON");

    public void A1W(AnonymousClass5Vo r3) {
        r3.A00.A06 = false;
    }

    public static PaymentBottomSheet A00() {
        return new PaymentBottomSheet();
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Log.i("onCreateView()");
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setAnimateParentHierarchy(false);
        ((ViewGroup) inflate.findViewById(R.id.fragment_container)).setLayoutTransition(layoutTransition);
        return inflate;
    }

    public Dialog A1J(Bundle bundle) {
        Log.i("onCreateDialog()");
        Dialog A1J = super.A1J(bundle);
        A1J.getWindow().addFlags(DefaultCrypto.BUFFER_SIZE);
        return A1J;
    }

    public void A1b(C08310eF r4) {
        C160757oG r2 = this.A04;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("navigate-to fragment=");
        r2.A04(AnonymousClass000.A0X(r4.getClass().getName(), A0o));
        C08240dc r22 = new C08240dc(A0T());
        r22.A02 = 17432576;
        r22.A03 = 17432577;
        r22.A05 = 17432576;
        r22.A06 = 17432577;
        r22.A07((C08310eF) C18290x4.A0k(A0T().A0Y.A05()));
        r22.A0A(r4, R.id.fragment_container);
        r22.A0I((String) null);
        r22.A01();
    }

    public void A0w(Bundle bundle, View view) {
        super.A0w(bundle, view);
        Log.i("onViewCreated()");
        if (this.A02 == null) {
            A1K();
            return;
        }
        C08240dc r2 = new C08240dc(A0T());
        r2.A09(this.A02, R.id.fragment_container);
        r2.A0I((String) null);
        r2.A01();
    }

    public void A1Y() {
        C08270df A0T = A0T();
        int A07 = A0T.A07();
        A0T.A0M();
        if (A07 <= 1) {
            A1K();
            DialogInterface.OnCancelListener onCancelListener = this.A00;
            if (onCancelListener != null) {
                onCancelListener.onCancel((DialogInterface) null);
            }
            this.A03.onDismiss((DialogInterface) null);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        DialogInterface.OnCancelListener onCancelListener = this.A00;
        if (onCancelListener != null) {
            onCancelListener.onCancel((DialogInterface) null);
        }
        AnonymousClass9XA r0 = this.A03;
        if (r0 != null) {
            r0.onDismiss(dialogInterface);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Log.i("onDismiss(dialog)");
        DialogInterface.OnDismissListener onDismissListener = this.A01;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    public void A1Z(DialogInterface.OnCancelListener onCancelListener) {
        this.A00 = onCancelListener;
    }

    public void A1a(DialogInterface.OnDismissListener onDismissListener) {
        this.A01 = onDismissListener;
    }

    public void A1c(C08310eF r1) {
        this.A02 = r1;
    }
}
