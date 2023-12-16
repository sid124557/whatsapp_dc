package com.whatsapp.settings;

import X.AnonymousClass000;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1R1;
import X.AnonymousClass2BF;
import X.AnonymousClass5RU;
import X.AnonymousClass5V0;
import X.AnonymousClass64I;
import X.C100295Aj;
import X.C107405bG;
import X.C107695bk;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C18320x8;
import X.C19340zH;
import X.C32491qk;
import X.C56802sa;
import X.C621433s;
import X.C634139d;
import X.C64333Db;
import X.C66553Lw;
import X.C88834as;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class SettingsNotifications extends C32491qk implements AnonymousClass64I {
    public static final int[] A0r = {R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public View A0F;
    public View A0G;
    public View A0H;
    public View A0I;
    public View A0J;
    public ViewGroup A0K;
    public ViewGroup A0L;
    public TextView A0M;
    public TextView A0N;
    public TextView A0O;
    public TextView A0P;
    public TextView A0Q;
    public TextView A0R;
    public TextView A0S;
    public TextView A0T;
    public TextView A0U;
    public TextView A0V;
    public TextView A0W;
    public SwitchCompat A0X;
    public SwitchCompat A0Y;
    public SwitchCompat A0Z;
    public SwitchCompat A0a;
    public SwitchCompat A0b;
    public AnonymousClass1R1 A0c;
    public AnonymousClass5RU A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public String[] A0m;
    public String[] A0n;
    public String[] A0o;
    public String[] A0p;
    public String[] A0q;

    public static int A0C(String str, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (str.equals(strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a1, code lost:
        X.C621433s.A01(r4, 7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b8, code lost:
        r1.setText(A0r[r6]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bf, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d3, code lost:
        r0 = r4.A0n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e9, code lost:
        r0 = r4.A0p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00eb, code lost:
        r1.setText(r0[r6]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f0, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bbh(int r5, int r6) {
        /*
            r4 = this;
            r3 = 7
            switch(r5) {
                case 9: goto L_0x00d6;
                case 10: goto L_0x00c0;
                case 11: goto L_0x0083;
                case 12: goto L_0x006f;
                case 13: goto L_0x005b;
                case 14: goto L_0x0028;
                case 15: goto L_0x0005;
                default: goto L_0x0004;
            }
        L_0x0004:
            return
        L_0x0005:
            r4.A00 = r6
            X.1R1 r3 = r4.A0c
            java.lang.String[] r0 = r4.A0q
            r0 = r0[r6]
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "individual_chat_defaults"
            X.2sa r1 = r3.A0M(r0)
            java.lang.String r0 = r1.A09
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 != 0) goto L_0x0024
            r1.A09 = r2
            r3.A0a(r1)
        L_0x0024:
            android.widget.TextView r1 = r4.A0O
            goto L_0x00e9
        L_0x0028:
            java.lang.String[] r0 = r4.A0m
            r2 = r0[r6]
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "Desire"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = "Wildfire"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0047
        L_0x003e:
            java.lang.String r0 = "00FF00"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0047
            goto L_0x00a1
        L_0x0047:
            r4.A01 = r6
            X.1R1 r2 = r4.A0c
            java.lang.String[] r0 = r4.A0m
            r0 = r0[r6]
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "group_chat_defaults"
            r2.A0b(r0, r1)
            android.widget.TextView r1 = r4.A0P
            goto L_0x00b8
        L_0x005b:
            r4.A02 = r6
            X.1R1 r2 = r4.A0c
            java.lang.String[] r0 = r4.A0o
            r0 = r0[r6]
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "group_chat_defaults"
            r2.A0c(r0, r1)
            android.widget.TextView r1 = r4.A0R
            goto L_0x00d3
        L_0x006f:
            r4.A03 = r6
            X.1R1 r2 = r4.A0c
            java.lang.String[] r0 = r4.A0q
            r0 = r0[r6]
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "group_chat_defaults"
            r2.A0e(r0, r1)
            android.widget.TextView r1 = r4.A0S
            goto L_0x00e9
        L_0x0083:
            java.lang.String[] r0 = r4.A0m
            r2 = r0[r6]
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "Desire"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0099
            java.lang.String r0 = "Wildfire"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00a5
        L_0x0099:
            java.lang.String r0 = "00FF00"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00a5
        L_0x00a1:
            X.C621433s.A01(r4, r3)
            return
        L_0x00a5:
            r4.A04 = r6
            X.1R1 r2 = r4.A0c
            java.lang.String[] r0 = r4.A0m
            r0 = r0[r6]
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "individual_chat_defaults"
            r2.A0b(r0, r1)
            android.widget.TextView r1 = r4.A0T
        L_0x00b8:
            int[] r0 = A0r
            r0 = r0[r6]
            r1.setText(r0)
            return
        L_0x00c0:
            r4.A05 = r6
            X.1R1 r2 = r4.A0c
            java.lang.String[] r0 = r4.A0o
            r0 = r0[r6]
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "individual_chat_defaults"
            r2.A0c(r0, r1)
            android.widget.TextView r1 = r4.A0V
        L_0x00d3:
            java.lang.String[] r0 = r4.A0n
            goto L_0x00eb
        L_0x00d6:
            r4.A06 = r6
            X.1R1 r2 = r4.A0c
            java.lang.String[] r0 = r4.A0q
            r0 = r0[r6]
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "individual_chat_defaults"
            r2.A0e(r0, r1)
            android.widget.TextView r1 = r4.A0W
        L_0x00e9:
            java.lang.String[] r0 = r4.A0p
        L_0x00eb:
            r0 = r0[r6]
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsNotifications.Bbh(int, int):void");
    }

    public Dialog onCreateDialog(int i) {
        C19340zH r2;
        if (i == 7) {
            r2 = AnonymousClass5V0.A00(this);
            r2.A0T(R.string.f11nameremoved);
            r2.A0Y((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
        } else if (i != 8) {
            return super.onCreateDialog(i);
        } else {
            r2 = AnonymousClass5V0.A00(this);
            r2.A0T(R.string.f11nameremoved);
            C19340zH.A08(r2, this, 93, R.string.f11nameremoved);
            r2.A0W((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
        }
        return r2.create();
    }

    public void A5r() {
        if (!this.A0l) {
            this.A0l = true;
            C88834as A0I2 = C18280x3.A0I(this);
            C64333Db r1 = A0I2.A4Z;
            AnonymousClass1Hf.A2G(r1, this);
            C107695bk r0 = r1.A00;
            AnonymousClass1Ha.A23(r1, r0, r0, this);
            AnonymousClass1Ha.A24(r1, this);
            this.A0c = (AnonymousClass1R1) r1.A56.get();
            this.A0d = A0I2.AD7();
        }
    }

    public final void A75() {
        View view;
        int i;
        C56802sa A0I2 = this.A0c.A0I();
        C56802sa A0H2 = this.A0c.A0H();
        this.A0g = A0I2.A07();
        this.A06 = A0C(A0I2.A08(), this.A0q);
        this.A05 = A0C(A0I2.A06(), this.A0o);
        this.A04 = A0C(A0I2.A05(), this.A0m);
        this.A0j = A0I2.A0A();
        this.A0f = A0H2.A07();
        this.A03 = A0C(A0H2.A08(), this.A0q);
        this.A02 = A0C(A0H2.A06(), this.A0o);
        this.A01 = A0C(A0H2.A05(), this.A0m);
        this.A0h = A0H2.A0A();
        this.A0e = A0I2.A03();
        this.A00 = A0C(A0I2.A04(), this.A0q);
        this.A0k = A0I2.A02().A0G;
        this.A0i = A0H2.A02().A0G;
        C634139d.A00(this.A09, this, 2);
        this.A0X.setChecked(AnonymousClass1Hf.A27(this).getBoolean("conversation_sound", true));
        this.A0U.setText(C66553Lw.A07(this, this.A0g));
        C634139d.A00(this.A0H, this, 9);
        int i2 = this.A06;
        if (i2 != -1) {
            this.A0W.setText(this.A0p[i2]);
        }
        AnonymousClass1Ha.A1x(this.A0J, this, 44);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            int A002 = C107405bG.A00(this, R.attr.f3nameremoved, R.color.f5nameremoved);
            this.A0M.setTextColor(A002);
            this.A0V.setTextColor(A002);
            this.A0V.setText(R.string.f11nameremoved);
            view = this.A0I;
            i = 45;
        } else {
            int i4 = this.A05;
            if (i4 != -1) {
                this.A0V.setText(this.A0n[i4]);
            }
            view = this.A0I;
            i = 46;
        }
        AnonymousClass1Ha.A1x(view, this, i);
        int i5 = this.A04;
        if (i5 != -1) {
            this.A0T.setText(A0r[i5]);
        }
        AnonymousClass1Ha.A1x(this.A0G, this, 47);
        this.A0F.setVisibility(0);
        SwitchCompat switchCompat = this.A0a;
        Boolean bool = Boolean.FALSE;
        switchCompat.setChecked(C18320x8.A1W(bool, this.A0j));
        AnonymousClass1Ha.A1x(this.A0F, this, 48);
        this.A0L.setVisibility(0);
        this.A0b.setChecked(C18320x8.A1W(bool, this.A0k));
        AnonymousClass1Ha.A1x(this.A0L, this, 49);
        this.A0K.setVisibility(0);
        this.A0Z.setChecked(C18320x8.A1W(bool, this.A0i));
        C634139d.A00(this.A0K, this, 0);
        this.A0Q.setText(C66553Lw.A07(this, this.A0f));
        C634139d.A00(this.A0C, this, 1);
        int i6 = this.A03;
        if (i6 != -1) {
            this.A0S.setText(this.A0p[i6]);
        }
        C634139d.A00(this.A0E, this, 3);
        if (i3 >= 29) {
            this.A0D.setVisibility(8);
        } else {
            int i7 = this.A02;
            if (i7 != -1) {
                this.A0R.setText(this.A0n[i7]);
            }
            C634139d.A00(this.A0D, this, 4);
        }
        int i8 = this.A01;
        if (i8 != -1) {
            this.A0P.setText(A0r[i8]);
        }
        C634139d.A00(this.A0B, this, 5);
        this.A0A.setVisibility(0);
        this.A0Y.setChecked(C18320x8.A1W(bool, this.A0h));
        C634139d.A00(this.A0A, this, 6);
        this.A0N.setText(C66553Lw.A07(this, this.A0e));
        C634139d.A00(this.A07, this, 7);
        int i9 = this.A00;
        if (i9 != -1) {
            this.A0O.setText(this.A0p[i9]);
        }
        C634139d.A00(this.A08, this, 8);
    }

    public SettingsNotifications(int i) {
        this.A0l = false;
        AnonymousClass1Hf.A2D(this, 98);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String A072;
        String str;
        TextView textView;
        super.onActivityResult(i, i2, intent);
        if ((i == 1 || i == 2 || i == 3) && i2 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri != null) {
                A072 = RingtoneManager.getRingtone(this, uri).getTitle(this);
                str = uri.toString();
            } else {
                A072 = C66553Lw.A07(this, (String) null);
                str = "Silent";
            }
            if (i == 1) {
                this.A0g = str;
                this.A0c.A0d("individual_chat_defaults", str);
                textView = this.A0U;
            } else if (i != 2) {
                this.A0e = str;
                AnonymousClass1R1 r2 = this.A0c;
                C56802sa A0M2 = r2.A0M("individual_chat_defaults");
                if (!TextUtils.equals(str, A0M2.A08)) {
                    A0M2.A08 = str;
                    r2.A0a(A0M2);
                }
                textView = this.A0N;
            } else {
                this.A0f = str;
                this.A0c.A0d("group_chat_defaults", str);
                textView = this.A0Q;
            }
            textView.setText(A072);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass1Ha.A1z(this);
        this.A09 = findViewById(R.id.conversation_sound_setting);
        this.A0X = (SwitchCompat) findViewById(R.id.conversation_sound_switch);
        this.A0H = findViewById(R.id.notification_tone_setting);
        this.A0U = C18310x6.A0L(this, R.id.selected_notification_tone);
        this.A0J = findViewById(R.id.vibrate_setting);
        this.A0W = C18310x6.A0L(this, R.id.selected_vibrate_setting);
        this.A0I = findViewById(R.id.popup_notification_setting);
        this.A0M = C18310x6.A0L(this, R.id.popup_notification_setting_title);
        this.A0V = C18310x6.A0L(this, R.id.selected_popup_notification_setting);
        this.A0G = findViewById(R.id.notification_light_setting);
        this.A0T = C18310x6.A0L(this, R.id.selected_notification_light_setting);
        this.A0F = findViewById(R.id.high_priority_notifications_setting);
        this.A0a = (SwitchCompat) findViewById(R.id.high_priority_notifications_switch);
        this.A0C = findViewById(R.id.group_notification_tone_setting);
        this.A0Q = C18310x6.A0L(this, R.id.selected_group_notification_tone);
        this.A0E = findViewById(R.id.group_vibrate_setting);
        this.A0S = C18310x6.A0L(this, R.id.selected_group_vibrate_setting);
        this.A0D = findViewById(R.id.group_popup_notification_setting);
        this.A0R = C18310x6.A0L(this, R.id.selected_group_popup_notification_setting);
        this.A0B = findViewById(R.id.group_notification_light_setting);
        this.A0P = C18310x6.A0L(this, R.id.selected_group_notification_light_setting);
        this.A0A = findViewById(R.id.group_high_priority_notifications_setting);
        this.A0Y = (SwitchCompat) findViewById(R.id.group_high_priority_notifications_switch);
        this.A07 = findViewById(R.id.call_tone_setting);
        this.A0N = C18310x6.A0L(this, R.id.selected_call_tone);
        this.A08 = findViewById(R.id.call_vibrate_setting);
        this.A0O = C18310x6.A0L(this, R.id.selected_call_vibrate_setting);
        this.A0L = (ViewGroup) findViewById(R.id.reaction_notifications_setting);
        this.A0K = (ViewGroup) findViewById(R.id.group_reaction_notifications_setting);
        this.A0b = (SwitchCompat) findViewById(R.id.reactions_switch);
        this.A0Z = (SwitchCompat) findViewById(R.id.group_reactions_switch);
        Resources resources = getResources();
        this.A0p = resources.getStringArray(R.array.f2nameremoved);
        this.A0q = resources.getStringArray(R.array.f2nameremoved);
        this.A0n = resources.getStringArray(R.array.f2nameremoved);
        this.A0o = resources.getStringArray(R.array.f2nameremoved);
        this.A0m = resources.getStringArray(R.array.f2nameremoved);
        A75();
        this.A0d.A02(this.A00, "notifications", AnonymousClass1Ha.A1q(this));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18290x4.A1E(menu, R.id.menuitem_reset_notification_settings, R.string.f11nameremoved);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_reset_notification_settings) {
            return super.onOptionsItemSelected(menuItem);
        }
        C621433s.A01(this, 8);
        return true;
    }

    public void onStart() {
        super.onStart();
        AnonymousClass1R1 r2 = this.A0c;
        if (AnonymousClass2BF.A00) {
            boolean A0n2 = r2.A0n("individual_chat_defaults");
            boolean A0n3 = r2.A0n("group_chat_defaults");
            if (A0n2 || A0n3) {
                Log.i("settings-jid-notifications/onStart settings-store updated, refreshing ui");
                A75();
            }
        }
    }

    public final void requestFocusOnViewAndHighlight(View view) {
        view.getParent().requestChildFocus(view, view);
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        Object[] objArr = new Object[2];
        AnonymousClass000.A1L(objArr, getResources().getColor(R.color.f5nameremoved));
        objArr[1] = Integer.valueOf(getResources().getColor(R.color.f5nameremoved));
        ValueAnimator ofObject = ValueAnimator.ofObject(argbEvaluator, objArr);
        ofObject.setRepeatMode(2);
        ofObject.setRepeatCount(1);
        ofObject.setDuration(500);
        ofObject.addUpdateListener(new C100295Aj(view, 17));
        ofObject.start();
    }

    public SettingsNotifications() {
        this(0);
    }
}
