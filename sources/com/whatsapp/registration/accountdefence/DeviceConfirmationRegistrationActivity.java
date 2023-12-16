package com.whatsapp.registration.accountdefence;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0R8;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1VW;
import X.AnonymousClass33K;
import X.AnonymousClass33p;
import X.AnonymousClass36l;
import X.AnonymousClass4SG;
import X.AnonymousClass6C6;
import X.C005205m;
import X.C06270Wx;
import X.C104005Pg;
import X.C106715a2;
import X.C107695bk;
import X.C18260x0;
import X.C18280x3;
import X.C53602nM;
import X.C55092pm;
import X.C60152y5;
import X.C64333Db;
import X.C71543cH;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86654Ky;
import X.C89644eZ;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import java.util.Objects;

public class DeviceConfirmationRegistrationActivity extends C89644eZ {
    public ProgressDialog A00;
    public TextEmojiLabel A01;
    public TextEmojiLabel A02;
    public TextEmojiLabel A03;
    public C53602nM A04;
    public AnonymousClass1VW A05;
    public AnonymousClass33K A06;
    public NewDeviceConfirmationRegistrationViewModel A07;
    public C106715a2 A08;
    public boolean A09;
    public boolean A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00b9, code lost:
        r0 = new X.C1891190b(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00be, code lost:
        r3.A0Y(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00e7, code lost:
        return r3.create();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r10) {
        /*
            r9 = this;
            r8 = 1
            r2 = 0
            r7 = 0
            switch(r10) {
                case 11: goto L_0x00e8;
                case 12: goto L_0x00c2;
                case 13: goto L_0x00aa;
                case 14: goto L_0x0094;
                case 15: goto L_0x0047;
                case 16: goto L_0x002a;
                case 17: goto L_0x000b;
                default: goto L_0x0006;
            }
        L_0x0006:
            android.app.Dialog r3 = super.onCreateDialog(r10)
            return r3
        L_0x000b:
            r2 = 2131888603(0x7f1209db, float:1.9411846E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.String r0 = X.AnonymousClass4SG.A2x(r9)
            java.lang.String r0 = X.AnonymousClass002.A0F(r9, r0, r1, r7, r2)
            X.0zH r3 = X.AnonymousClass5V0.A00(r9)
            android.text.Spanned r0 = X.AnonymousClass0x9.A0B(r0)
            r3.A0g(r0)
            r2 = 2131891394(0x7f1214c2, float:1.9417507E38)
            r1 = 83
            goto L_0x00b9
        L_0x002a:
            X.0zH r3 = X.AnonymousClass5V0.A00(r9)
            r0 = 2131892998(0x7f121b06, float:1.942076E38)
            r3.A0U(r0)
            r0 = 2131892997(0x7f121b05, float:1.9420758E38)
            r3.A0T(r0)
            r3.A0i(r7)
            r2 = 2131891394(0x7f1214c2, float:1.9417507E38)
            r0 = 118(0x76, float:1.65E-43)
            X.68t r0 = X.C1235268t.A00(r9, r0)
            goto L_0x00be
        L_0x0047:
            com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r0 = r9.A07
            long r3 = r0.A0D()
            android.view.LayoutInflater r1 = r9.getLayoutInflater()
            r0 = 2131624078(0x7f0e008e, float:1.8875326E38)
            android.view.View r1 = r1.inflate(r0, r2)
            r0 = 2131431506(0x7f0b1052, float:1.8484743E38)
            com.whatsapp.TextEmojiLabel r6 = X.AnonymousClass0x7.A0K(r1, r0)
            X.0zH r5 = X.AnonymousClass5V0.A02(r9, r1)
            r2 = 2131893166(0x7f121bae, float:1.94211E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            X.33j r0 = r9.A00
            java.lang.String r0 = X.C107565bW.A0D(r0, r3)
            java.lang.String r0 = X.AnonymousClass002.A0F(r9, r0, r1, r7, r2)
            r5.A0h(r0)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 82
            X.C86614Ku.A1O(r5, r9, r0, r1)
            X.043 r3 = r5.create()
            r0 = 2131893165(0x7f121bad, float:1.9421099E38)
            r6.setText(r0)
            r0 = 32
            X.3cH r1 = new X.3cH
            r1.<init>((java.lang.Object) r9, (int) r0)
            java.lang.String r0 = "send-device-confirmation-too-recent-dialog-learn-more"
            r9.A75(r6, r1, r0)
            return r3
        L_0x0094:
            X.0zH r3 = X.AnonymousClass5V0.A00(r9)
            r0 = 2131893164(0x7f121bac, float:1.9421097E38)
            r3.A0U(r0)
            r0 = 2131893163(0x7f121bab, float:1.9421095E38)
            r3.A0T(r0)
            r2 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r1 = 81
            goto L_0x00b9
        L_0x00aa:
            X.0zH r3 = X.AnonymousClass5V0.A00(r9)
            r0 = 2131893162(0x7f121baa, float:1.9421093E38)
            r3.A0T(r0)
            r2 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r1 = 80
        L_0x00b9:
            X.90b r0 = new X.90b
            r0.<init>(r9, r1)
        L_0x00be:
            r3.A0Y(r0, r2)
            goto L_0x00e3
        L_0x00c2:
            android.view.LayoutInflater r1 = r9.getLayoutInflater()
            r0 = 2131624767(0x7f0e033f, float:1.8876723E38)
            android.view.View r2 = r1.inflate(r0, r2)
            X.0zH r3 = X.AnonymousClass5V0.A00(r9)
            r0 = 2131434620(0x7f0b1c7c, float:1.849106E38)
            android.widget.TextView r1 = X.AnonymousClass002.A09(r2, r0)
            if (r1 == 0) goto L_0x00e0
            r0 = 2131893170(0x7f121bb2, float:1.9421109E38)
            r1.setText(r0)
        L_0x00e0:
            r3.setView(r2)
        L_0x00e3:
            X.043 r3 = r3.create()
            return r3
        L_0x00e8:
            android.view.LayoutInflater r1 = r9.getLayoutInflater()
            r0 = 2131624078(0x7f0e008e, float:1.8875326E38)
            android.view.View r4 = r1.inflate(r0, r2)
            X.0zH r3 = X.AnonymousClass5V0.A02(r9, r4)
            r0 = 2131893169(0x7f121bb1, float:1.9421107E38)
            r3.A0U(r0)
            r1 = 2131893475(0x7f121ce3, float:1.9421728E38)
            r0 = 117(0x75, float:1.64E-43)
            X.C1235268t.A03(r3, r9, r0, r1)
            r2 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r1 = 79
            X.90b r0 = new X.90b
            r0.<init>(r9, r1)
            r3.A0W(r0, r2)
            X.043 r3 = r3.create()
            r0 = 2131431506(0x7f0b1052, float:1.8484743E38)
            com.whatsapp.TextEmojiLabel r2 = X.C86644Kx.A0M(r4, r0)
            r0 = 31
            X.3cH r1 = new X.3cH
            r1.<init>((java.lang.Object) r9, (int) r0)
            java.lang.String r0 = "send-device-confirmation-dialog-learn-more"
            r9.A75(r2, r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity.onCreateDialog(int):android.app.Dialog");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 2, 0, R.string.f11nameremoved);
        if (!this.A0A) {
            menu.add(0, 1, 0, R.string.f11nameremoved);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void A5r() {
        if (!this.A09) {
            this.A09 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A08 = C18280x3.A0Q(r1);
            this.A06 = C86654Ky.A0Y(A2Y);
            this.A05 = C86624Kv.A0S(A2Y);
            this.A04 = C18280x3.A0L(r1);
        }
    }

    public final void A74() {
        Log.i("DeviceConfirmationRegistrationActivity/removeProgressDialog/");
        ProgressDialog progressDialog = this.A00;
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        this.A00 = null;
    }

    public final void A75(TextEmojiLabel textEmojiLabel, Runnable runnable, String str) {
        C106715a2 r4 = this.A08;
        Context context = textEmojiLabel.getContext();
        String A0u = C86614Ku.A0u(textEmojiLabel);
        Objects.requireNonNull(runnable);
        SpannableStringBuilder A052 = r4.A05(context, new C71543cH((Object) runnable, 27), A0u, str);
        AnonymousClass0x2.A14(this.A0D, textEmojiLabel);
        AnonymousClass0x2.A12(textEmojiLabel, this.A08);
        textEmojiLabel.setText(A052);
    }

    public DeviceConfirmationRegistrationActivity(int i) {
        this.A09 = false;
        C86604Kt.A1K(this, 88);
    }

    public void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        Toolbar toolbar = (Toolbar) findViewById(R.id.title_toolbar);
        if (!ViewConfiguration.get(this).hasPermanentMenuKey()) {
            setSupportActionBar(toolbar);
            AnonymousClass0R8 supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.A0N(false);
                supportActionBar.A0Q(false);
            }
        }
        AnonymousClass36l.A0M(this, this.A05, R.id.title_toolbar_text);
        NewDeviceConfirmationRegistrationViewModel newDeviceConfirmationRegistrationViewModel = (NewDeviceConfirmationRegistrationViewModel) AnonymousClass0x9.A0H(this).A01(NewDeviceConfirmationRegistrationViewModel.class);
        this.A07 = newDeviceConfirmationRegistrationViewModel;
        AnonymousClass33p r1 = newDeviceConfirmationRegistrationViewModel.A09;
        newDeviceConfirmationRegistrationViewModel.A00 = r1.A0Z();
        newDeviceConfirmationRegistrationViewModel.A01 = r1.A0b();
        this.A06.A00(this.A07);
        if (bundle == null && (intent = getIntent()) != null) {
            boolean hasExtra = intent.hasExtra("sms_retry_time");
            boolean hasExtra2 = intent.hasExtra("voice_retry_time");
            long longExtra = intent.getLongExtra("sms_retry_time", 0);
            long longExtra2 = intent.getLongExtra("voice_retry_time", 0);
            this.A0A = getIntent().getBooleanExtra("change_number", false);
            boolean booleanExtra = getIntent().getBooleanExtra("use_sms_retriever", false);
            NewDeviceConfirmationRegistrationViewModel newDeviceConfirmationRegistrationViewModel2 = this.A07;
            boolean z = this.A0A;
            if (hasExtra) {
                C104005Pg r9 = newDeviceConfirmationRegistrationViewModel2.A0F.A06;
                C18260x0.A12("AccountDefenceLocalDataRepository/saveSmsRetryTime/", AnonymousClass001.A0o(), longExtra);
                SharedPreferences.Editor A002 = C60152y5.A00(r9.A01, "AccountDefenceLocalDataRepository_prefs");
                A002.putLong("com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.sms_retry_time", longExtra);
                if (!A002.commit()) {
                    Log.e("AccountDefenceLocalDataRepositoryAccountDefenceLocalDataRepository/saveSmsRetryTime/error");
                }
            }
            if (hasExtra2) {
                C104005Pg r7 = newDeviceConfirmationRegistrationViewModel2.A0F.A06;
                C18260x0.A12("AccountDefenceLocalDataRepository/saveVoiceRetryTime/", AnonymousClass001.A0o(), longExtra2);
                SharedPreferences.Editor A003 = C60152y5.A00(r7.A01, "AccountDefenceLocalDataRepository_prefs");
                A003.putLong("com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.voice_retry_time", longExtra2);
                if (!A003.commit()) {
                    Log.e("AccountDefenceLocalDataRepositoryAccountDefenceLocalDataRepository/saveVoiceRetryTime/error");
                }
            }
            newDeviceConfirmationRegistrationViewModel2.A03 = z;
            newDeviceConfirmationRegistrationViewModel2.A04 = booleanExtra;
        }
        AnonymousClass6C6.A01(this, this.A07.A0I, 285);
        AnonymousClass6C6.A01(this, this.A07.A0H, 286);
        NewDeviceConfirmationRegistrationViewModel newDeviceConfirmationRegistrationViewModel3 = this.A07;
        int A004 = newDeviceConfirmationRegistrationViewModel3.A0D.A00();
        C18260x0.A0y("NewDeviceConfirmationRegistrationViewModel/validateRegistrationState/registration state is ", AnonymousClass001.A0o(), A004);
        if (A004 != 14) {
            C06270Wx.A03(newDeviceConfirmationRegistrationViewModel3.A0I, 1);
        }
        this.A02 = (TextEmojiLabel) C005205m.A00(this, R.id.device_confirmation_learn_more);
        this.A03 = (TextEmojiLabel) C005205m.A00(this, R.id.device_confirmation_resend_notice);
        this.A01 = (TextEmojiLabel) C005205m.A00(this, R.id.device_confirmation_second_code);
        TextEmojiLabel textEmojiLabel = this.A02;
        Object[] A0L = AnonymousClass002.A0L();
        A0L[0] = AnonymousClass4SG.A2x(this);
        AnonymousClass001.A0y(this, textEmojiLabel, A0L, R.string.device_confirmation_learn_more_message);
        A75(this.A02, new C71543cH((Object) this, 28), "device-confirmation-learn-more");
        A75(this.A03, new C71543cH((Object) this, 29), "device-confirmation-resend-notice");
        A75(this.A01, new C71543cH((Object) this, 30), "confirm-with-second-code");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != 1) {
            if (itemId == 2) {
                NewDeviceConfirmationRegistrationViewModel newDeviceConfirmationRegistrationViewModel = this.A07;
                C55092pm r2 = newDeviceConfirmationRegistrationViewModel.A0E;
                r2.A02("device-confirm");
                newDeviceConfirmationRegistrationViewModel.A0B.A01(this, r2, "device-confirm");
            }
            return super.onOptionsItemSelected(menuItem);
        }
        this.A07.A0E();
        return true;
    }

    public DeviceConfirmationRegistrationActivity() {
        this(0);
    }
}
