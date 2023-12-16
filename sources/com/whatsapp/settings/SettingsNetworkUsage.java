package com.whatsapp.settings;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0YV;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass35V;
import X.AnonymousClass5RU;
import X.C005205m;
import X.C107145am;
import X.C107175ap;
import X.C107505bQ;
import X.C107575bX;
import X.C107695bk;
import X.C118465ta;
import X.C149017Kp;
import X.C18280x3;
import X.C18910yS;
import X.C19340zH;
import X.C56492s4;
import X.C620733j;
import X.C626936e;
import X.C64333Db;
import X.C88834as;
import X.C89644eZ;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.Statistics$Data;
import com.whatsapp.components.RoundCornerProgressBar;
import com.whatsapp.util.Log;
import java.text.NumberFormat;
import java.util.Timer;
import java.util.TimerTask;

public class SettingsNetworkUsage extends C89644eZ {
    public Handler A00;
    public C56492s4 A01;
    public C620733j A02;
    public AnonymousClass5RU A03;
    public TimerTask A04;
    public boolean A05;
    public final Timer A06;

    public class ResetUsageConfirmationDialog extends Hilt_SettingsNetworkUsage_ResetUsageConfirmationDialog {
        public Dialog A1J(Bundle bundle) {
            C19340zH A0K = C18280x3.A0K(this);
            A0K.A0T(R.string.f11nameremoved);
            C19340zH.A08(A0K, this, 92, R.string.f11nameremoved);
            C19340zH.A05(A0K);
            return A0K.create();
        }
    }

    public void A5r() {
        if (!this.A05) {
            this.A05 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r1 = A0I.A4Z;
            AnonymousClass1Hf.A2G(r1, this);
            C107695bk r0 = r1.A00;
            AnonymousClass1Ha.A23(r1, r0, r0, this);
            AnonymousClass1Ha.A24(r1, this);
            this.A01 = C64333Db.A07(r1);
            this.A02 = C64333Db.A2t(r1);
            this.A03 = A0I.AD7();
        }
    }

    public final void A75(boolean z) {
        String A0F;
        if (z) {
            C56492s4 r2 = this.A01;
            Log.i("statistics/reset");
            C18910yS r22 = r2.A00;
            C626936e.A0C(AnonymousClass000.A1W(r22));
            r22.sendEmptyMessage(9);
        }
        Statistics$Data A002 = this.A01.A00();
        NumberFormat instance = NumberFormat.getInstance(C620733j.A02(this.A02));
        long j = A002.A0E + A002.A0G + A002.A0M + A002.A0D + A002.A0J;
        long j2 = A002.A01 + A002.A03 + A002.A0B + A002.A00 + A002.A08;
        long j3 = j + j2;
        C149017Kp A012 = AnonymousClass35V.A01(this.A02, j3);
        StringBuilder A0o = AnonymousClass001.A0o();
        String str = A012.A01;
        A0o.append(str);
        A0o.append(A012.A02);
        String str2 = A012.A00;
        SpannableString spannableString = new SpannableString(AnonymousClass000.A0X(str2, A0o));
        if (!str.isEmpty()) {
            spannableString.setSpan(new AbsoluteSizeSpan(16, true), 0, str.length(), 33);
        }
        if (!str2.isEmpty()) {
            spannableString.setSpan(new AbsoluteSizeSpan(16, true), spannableString.length() - str2.length(), spannableString.length(), 33);
        }
        C005205m.A01(this, R.id.total_network_usage).setText(spannableString);
        C005205m.A01(this, R.id.total_network_usage_sent).setText(AnonymousClass35V.A05(this.A02, j));
        C005205m.A01(this, R.id.total_network_usage_received).setText(AnonymousClass35V.A05(this.A02, j2));
        long j4 = j3;
        A74(R.id.call_data_sent, R.id.call_data_received, R.id.calls_data_bar, A002.A0M, A002.A0B, j4);
        long j5 = A002.A0N;
        long j6 = A002.A0C;
        TextView A013 = C005205m.A01(this, R.id.calls_info);
        C620733j r8 = this.A02;
        A013.setText(C107575bX.A05(r8, r8.A0L(new Object[]{instance.format(j5)}, R.plurals.f9nameremoved, j5), this.A02.A0L(new Object[]{instance.format(j6)}, R.plurals.f9nameremoved, j6)));
        A74(R.id.media_data_sent, R.id.media_data_received, R.id.media_data_bar, A002.A0E, A002.A01, j4);
        long j7 = A002.A0D;
        long j8 = A002.A00;
        if (AnonymousClass0YV.A0F(getApplicationContext()) || j7 > 0 || j8 > 0) {
            A74(R.id.gdrive_data_sent, R.id.gdrive_data_received, R.id.gdrive_data_bar, j7, j8, j4);
        } else {
            C005205m.A00(this, R.id.gdrive_row).setVisibility(8);
        }
        A74(R.id.messages_data_sent, R.id.messages_data_received, R.id.messages_data_bar, A002.A0G, A002.A03, j4);
        long j9 = A002.A0L + A002.A0F;
        long j10 = A002.A0A + A002.A02;
        TextView A014 = C005205m.A01(this, R.id.messages_info);
        C620733j r12 = this.A02;
        A014.setText(C107575bX.A05(r12, r12.A0L(new Object[]{instance.format(j9)}, R.plurals.f9nameremoved, j9), this.A02.A0L(new Object[]{instance.format(j10)}, R.plurals.f9nameremoved, j10)));
        A74(R.id.status_data_sent, R.id.status_data_received, R.id.status_data_bar, A002.A0J, A002.A08, j4);
        long j11 = A002.A0K;
        long j12 = A002.A09;
        TextView A015 = C005205m.A01(this, R.id.status_info);
        C620733j r122 = this.A02;
        A015.setText(C107575bX.A05(r122, r122.A0L(new Object[]{instance.format(j11)}, R.plurals.f9nameremoved, j11), this.A02.A0L(new Object[]{instance.format(j12)}, R.plurals.f9nameremoved, j12)));
        A74(R.id.roaming_data_sent, R.id.roaming_data_received, R.id.roaming_data_bar, A002.A0I, A002.A07, j3);
        long j13 = A002.A0O;
        if (j13 != Long.MIN_VALUE) {
            C005205m.A00(this, R.id.last_updated_date).setVisibility(0);
            C620733j r6 = this.A02;
            A0F = AnonymousClass002.A0F(this, C107175ap.A04(r6, C107505bQ.A06(r6, j13), C107145am.A00(r6, j13)), new Object[1], 0, R.string.f11nameremoved);
            AnonymousClass001.A0y(this, C005205m.A01(this, R.id.last_updated_date), new Object[]{C107505bQ.A06(this.A02, j13)}, R.string.f11nameremoved);
        } else {
            A0F = AnonymousClass002.A0F(this, getString(R.string.f11nameremoved), new Object[1], 0, R.string.f11nameremoved);
            C005205m.A00(this, R.id.last_updated_date).setVisibility(8);
        }
        C005205m.A01(this, R.id.last_usage_reset).setText(A0F);
    }

    public SettingsNetworkUsage(int i) {
        this.A05 = false;
        AnonymousClass1Hf.A2D(this, 97);
    }

    public final void A74(int i, int i2, int i3, long j, long j2, long j3) {
        TextView A012 = C005205m.A01(this, i);
        String A052 = AnonymousClass35V.A05(this.A02, j);
        A012.setText(A052);
        String A0H = this.A02.A0H(A052);
        int i4 = 0;
        A012.setContentDescription(AnonymousClass002.A0F(this, A0H, new Object[1], 0, R.string.f11nameremoved));
        TextView A013 = C005205m.A01(this, i2);
        String A053 = AnonymousClass35V.A05(this.A02, j2);
        A013.setText(A053);
        Object[] objArr = new Object[1];
        C620733j.A03(this.A02, A053, objArr, 0);
        A013.setContentDescription(getString(R.string.f11nameremoved, objArr));
        if (j3 > 0) {
            i4 = (int) ((((float) (j + j2)) * 100.0f) / ((float) j3));
        }
        ((RoundCornerProgressBar) C005205m.A00(this, i3)).setProgress(i4);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass1Ha.A1z(this);
        AnonymousClass1Ha.A1x(C005205m.A00(this, R.id.reset_network_usage_row), this, 43);
        this.A00 = new Handler(Looper.myLooper());
        this.A03.A02(this.A00, "network_usage", AnonymousClass1Ha.A1q(this));
    }

    public void onDestroy() {
        super.onDestroy();
        this.A06.cancel();
    }

    public void onPause() {
        super.onPause();
        this.A04.cancel();
    }

    public void onResume() {
        super.onResume();
        C118465ta r1 = new C118465ta(this);
        this.A04 = r1;
        this.A06.scheduleAtFixedRate(r1, 0, 1000);
    }

    public SettingsNetworkUsage() {
        this(0);
        this.A06 = new Timer("refresh-network-usage");
    }
}
