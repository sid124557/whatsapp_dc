package com.whatsapp.stickers.thirdparty;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0HG;
import X.AnonymousClass0x7;
import X.AnonymousClass2Qb;
import X.AnonymousClass4FS;
import X.AnonymousClass4FV;
import X.AnonymousClass4GJ;
import X.AnonymousClass4HO;
import X.AnonymousClass4HY;
import X.AnonymousClass5VY;
import X.C003203q;
import X.C08310eF;
import X.C109675f0;
import X.C116865qz;
import X.C17190ui;
import X.C18270x1;
import X.C18280x3;
import X.C18310x6;
import X.C18320x8;
import X.C19340zH;
import X.C33841tm;
import X.C56872sh;
import X.C626936e;
import X.C69263Wi;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class AddThirdPartyStickerPackActivity extends C003203q implements AnonymousClass4GJ {
    public AnonymousClass4FV A00;
    public C33841tm A01;
    public AnonymousClass2Qb A02;
    public AnonymousClass4FS A03;
    public boolean A04;
    public final Object A05;
    public volatile C116865qz A06;

    public class AddStickerPackDialogFragment extends Hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment {
        public C69263Wi A00;
        public AnonymousClass2Qb A01;
        public String A02;
        public String A03;
        public String A04;
        public String A05;
        public final View.OnClickListener A06 = new C109675f0(this, 17);
        public final View.OnClickListener A07 = new C109675f0(this, 16);
        public final View.OnClickListener A08 = new C109675f0(this, 15);
        public final C56872sh A09 = new AnonymousClass4HO(this, 1);

        public final void A1V(int i, int i2, String str, int i3) {
            Dialog dialog = this.A03;
            if (dialog != null) {
                View findViewById = dialog.findViewById(R.id.message_text_view);
                C626936e.A04(findViewById);
                C18280x3.A1E(str, (TextView) findViewById);
                AnonymousClass0HG.A00(dialog, R.id.progress_bar).setVisibility(i);
                AnonymousClass0HG.A00(dialog, R.id.ok_button).setVisibility(i2);
                AnonymousClass0HG.A00(dialog, R.id.cancel_button).setVisibility(i3);
                AnonymousClass0HG.A00(dialog, R.id.add_button).setVisibility(i3);
            }
        }

        public void A0a() {
            super.A0a();
            AnonymousClass2Qb r0 = this.A01;
            r0.A01.A07(this.A09);
        }

        public void A0p(Bundle bundle) {
            super.A0p(bundle);
            AnonymousClass2Qb r0 = this.A01;
            r0.A01.A06(this.A09);
        }

        public Dialog A1J(Bundle bundle) {
            super.A1J(bundle);
            Bundle bundle2 = this.A06;
            if (bundle2 != null) {
                this.A03 = bundle2.getString("sticker_pack_id");
                this.A02 = bundle2.getString("sticker_pack_authority");
                String string = bundle2.getString("sticker_pack_name");
                this.A04 = string;
                if (string != null) {
                    this.A05 = Html.escapeHtml(string);
                }
            }
            View A0H = C18310x6.A0H(LayoutInflater.from(A1D()), R.layout.f8nameremoved);
            AnonymousClass002.A09(A0H, R.id.message_text_view).setText(AnonymousClass0x7.A0m(this, C08310eF.A09(this).getString(R.string.f11nameremoved), AnonymousClass002.A0L(), R.string.f11nameremoved));
            View findViewById = A0H.findViewById(R.id.ok_button);
            findViewById.setVisibility(8);
            findViewById.setOnClickListener(this.A08);
            View findViewById2 = A0H.findViewById(R.id.cancel_button);
            findViewById2.setVisibility(8);
            findViewById2.setOnClickListener(this.A07);
            View findViewById3 = A0H.findViewById(R.id.add_button);
            findViewById3.setOnClickListener(this.A06);
            findViewById3.setVisibility(8);
            C19340zH A0K = C18280x3.A0K(this);
            A0K.setView(A0H);
            return A0K.create();
        }

        public void onDismiss(DialogInterface dialogInterface) {
            super.onDismiss(dialogInterface);
            C003203q A0Q = A0Q();
            if (A0Q != null) {
                A0Q.finish();
                A0Q.overridePendingTransition(0, 0);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String packageName;
        StringBuilder A0o;
        String str;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("sticker_pack_id");
        String stringExtra2 = getIntent().getStringExtra("sticker_pack_authority");
        String stringExtra3 = getIntent().getStringExtra("sticker_pack_name");
        if (!(getCallingActivity() == null || (packageName = getCallingActivity().getPackageName()) == null)) {
            ProviderInfo resolveContentProvider = this.A02.A00.resolveContentProvider(stringExtra2, 128);
            if (resolveContentProvider == null) {
                A0o = AnonymousClass001.A0o();
                str = "cannot find the provider for authority: ";
            } else if (!packageName.equals(resolveContentProvider.packageName)) {
                A0o = AnonymousClass001.A0o();
                A0o.append("the calling activity: ");
                A0o.append(packageName);
                str = " does not own authority: ";
            }
            String A0V = AnonymousClass000.A0V(str, stringExtra2, A0o);
            Intent A07 = C18320x8.A07();
            A07.putExtra("validation_error", A0V);
            setResult(0, A07);
            Log.e(A0V);
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        C33841tm r2 = new C33841tm(this, this.A00, this.A02, stringExtra, stringExtra2, stringExtra3);
        this.A01 = r2;
        C18270x1.A0w(r2, this.A03);
    }

    public final Object generatedComponent() {
        if (this.A06 == null) {
            synchronized (this.A05) {
                if (this.A06 == null) {
                    this.A06 = new C116865qz(this);
                }
            }
        }
        return this.A06.generatedComponent();
    }

    public AddThirdPartyStickerPackActivity(int i) {
        this.A05 = AnonymousClass002.A0D();
        this.A04 = false;
        AnonymousClass4HY.A00(this, 122);
    }

    public C17190ui B6u() {
        return AnonymousClass5VY.A00(this, super.B6u());
    }

    public void onDestroy() {
        super.onDestroy();
        C33841tm r0 = this.A01;
        if (r0 != null && !C18320x8.A1T(r0)) {
            this.A01.A0D(true);
        }
    }

    public AddThirdPartyStickerPackActivity() {
        this(0);
    }
}
