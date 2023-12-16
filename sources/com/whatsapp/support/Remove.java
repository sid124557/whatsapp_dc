package com.whatsapp.support;

import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass4GJ;
import X.AnonymousClass5VY;
import X.C003203q;
import X.C116865qz;
import X.C17190ui;
import X.C18320x8;
import X.C86604Kt;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;

public class Remove extends C003203q implements AnonymousClass4GJ {
    public boolean A00;
    public final Object A01;
    public volatile C116865qz A02;

    public final Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = new C116865qz(this);
                }
            }
        }
        return this.A02.generatedComponent();
    }

    public Remove(int i) {
        this.A01 = AnonymousClass002.A0D();
        this.A00 = false;
        C86604Kt.A1K(this, 105);
    }

    public C17190ui B6u() {
        return AnonymousClass5VY.A00(this, super.B6u());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        Intent A07 = C18320x8.A07();
        A07.putExtra("is_removed", true);
        AnonymousClass0x2.A0m(this, A07);
    }

    public Remove() {
        this(0);
    }
}
