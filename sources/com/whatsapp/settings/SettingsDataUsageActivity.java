package com.whatsapp.settings;

import X.AnonymousClass001;
import X.AnonymousClass08M;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VX;
import X.AnonymousClass297;
import X.AnonymousClass33p;
import X.AnonymousClass3Ci;
import X.AnonymousClass3DM;
import X.AnonymousClass3XH;
import X.AnonymousClass4FS;
import X.AnonymousClass4FV;
import X.AnonymousClass4HS;
import X.AnonymousClass5RU;
import X.AnonymousClass5UP;
import X.AnonymousClass5V0;
import X.AnonymousClass5W3;
import X.AnonymousClass5W4;
import X.AnonymousClass5ZM;
import X.AnonymousClass5ZR;
import X.AnonymousClass64I;
import X.AnonymousClass69A;
import X.C06560Yg;
import X.C104675Rx;
import X.C107405bG;
import X.C107695bk;
import X.C118455tZ;
import X.C124266Bp;
import X.C15910sA;
import X.C179658jV;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C18330xA;
import X.C19340zH;
import X.C29171iO;
import X.C32491qk;
import X.C33711tZ;
import X.C34441vA;
import X.C54292oU;
import X.C56312rm;
import X.C56492s4;
import X.C56612sH;
import X.C56972sr;
import X.C58422vE;
import X.C627736r;
import X.C64333Db;
import X.C69263Wi;
import X.C71293bs;
import X.C88834as;
import X.C989653x;
import X.C994355s;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class SettingsDataUsageActivity extends C32491qk implements AnonymousClass64I, C179658jV {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public Handler A07;
    public View A08;
    public View A09;
    public TextView A0A;
    public TextView A0B;
    public TextView A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public SwitchCompat A0H;
    public C29171iO A0I;
    public AnonymousClass5W3 A0J;
    public C56492s4 A0K;
    public AnonymousClass5W4 A0L;
    public WaTextView A0M;
    public WaTextView A0N;
    public C54292oU A0O;
    public AnonymousClass5ZR A0P;
    public AnonymousClass3DM A0Q;
    public AnonymousClass4FV A0R;
    public AnonymousClass3XH A0S;
    public AnonymousClass5UP A0T;
    public C56312rm A0U;
    public C33711tZ A0V;
    public SettingsDataUsageViewModel A0W;
    public AnonymousClass5RU A0X;
    public C104675Rx A0Y;
    public AnonymousClass5ZM A0Z;
    public C34441vA A0a;
    public String A0b;
    public String A0c;
    public TimerTask A0d;
    public boolean A0e;
    public String[] A0f;
    public String[] A0g;
    public final Timer A0h;

    public void Bbh(int i, int i2) {
        int i3;
        TextView textView;
        Context context;
        int[] iArr;
        int A022;
        if (i == 5) {
            AnonymousClass33p r2 = this.A0L.A01;
            if (C18280x3.A02(AnonymousClass0x2.A0F(r2), "video_quality") != i2) {
                C18270x1.A0h(C18270x1.A03(r2), "video_quality", i2);
                textView = this.A0F;
                AnonymousClass5W4 r0 = this.A0L;
                context = r0.A00;
                iArr = AnonymousClass5W4.A03;
                A022 = C18280x3.A02(AnonymousClass0x2.A0F(r0.A01), "video_quality");
            } else {
                return;
            }
        } else if (i == 6) {
            AnonymousClass33p r22 = this.A0J.A01;
            if (C18280x3.A02(AnonymousClass0x2.A0F(r22), "photo_quality") != i2) {
                C18270x1.A0h(C18270x1.A03(r22), "photo_quality", i2);
                textView = this.A0E;
                AnonymousClass5W3 r02 = this.A0J;
                context = r02.A00;
                iArr = AnonymousClass5W3.A03;
                A022 = C18280x3.A02(AnonymousClass0x2.A0F(r02.A01), "photo_quality");
            } else {
                return;
            }
        } else if (i == 7) {
            if (i2 == 0) {
                i3 = 1;
            } else if (i2 != 1) {
                i3 = 30;
                if (i2 != 2) {
                    i3 = 0;
                }
            } else {
                i3 = 7;
            }
            C18270x1.A0h(C18270x1.A03(this.A09), "newsletter_media_cache_purge_after", i3);
            A77(i3);
            return;
        } else {
            return;
        }
        textView.setText(context.getString(iArr[A022]));
    }

    public Dialog onCreateDialog(int i) {
        if (i != 1) {
            return super.onCreateDialog(i);
        }
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0T(R.string.f11nameremoved);
        A002.A0Y(new AnonymousClass69A(12), R.string.f11nameremoved);
        return A002.create();
    }

    public static /* synthetic */ void A0C(SettingsDataUsageActivity settingsDataUsageActivity) {
        if (!settingsDataUsageActivity.A0P.A0E()) {
            int i = Build.VERSION.SDK_INT;
            int i2 = R.string.f11nameremoved;
            if (i >= 30) {
                i2 = R.string.f11nameremoved;
                if (i < 33) {
                    i2 = R.string.f11nameremoved;
                }
            }
            RequestPermissionActivity.A0b(settingsDataUsageActivity, R.string.f11nameremoved, i2);
            return;
        }
        settingsDataUsageActivity.startActivityForResult(C627736r.A12(settingsDataUsageActivity, settingsDataUsageActivity.A0c, settingsDataUsageActivity.A0b, 1), 1);
    }

    public void A5r() {
        if (!this.A0e) {
            this.A0e = true;
            C88834as A0I2 = C18280x3.A0I(this);
            C64333Db r2 = A0I2.A4Z;
            AnonymousClass1Hf.A2G(r2, this);
            C107695bk r0 = r2.A00;
            AnonymousClass1Ha.A23(r2, r0, r0, this);
            AnonymousClass1Ha.A24(r2, this);
            this.A0O = C64333Db.A2q(r2);
            this.A0K = C64333Db.A07(r2);
            this.A0R = C64333Db.A4H(r2);
            this.A0a = (C34441vA) r2.AIb.get();
            this.A0T = (AnonymousClass5UP) r2.ANe.get();
            this.A0Q = (AnonymousClass3DM) r2.A76.get();
            this.A0S = (AnonymousClass3XH) r2.AJX.get();
            this.A0P = C64333Db.A2r(r2);
            this.A0U = r2.AqI();
            this.A0I = (C29171iO) r2.A0s.get();
            this.A0X = A0I2.AD7();
        }
    }

    public final void A76() {
        this.A0G.setVisibility(0);
        Log.i("settings-data-usage-activity/loadStorageData");
        AnonymousClass4HS r1 = new AnonymousClass4HS((C15910sA) this, this);
        this.A0Z = r1;
        AnonymousClass0x7.A1B(r1, this.A04);
        C33711tZ r12 = new C33711tZ(this);
        this.A0V = r12;
        AnonymousClass0x7.A1B(r12, this.A04);
    }

    public final void A77(int i) {
        WaTextView waTextView = this.A0M;
        int i2 = R.string.f11nameremoved;
        if (i != 1) {
            i2 = R.string.f11nameremoved;
            if (i != 7) {
                i2 = R.string.f11nameremoved;
                if (i != 30) {
                    i2 = R.string.f11nameremoved;
                }
            }
        }
        waTextView.setText(i2);
    }

    public final void A78(int i) {
        WaTextView waTextView;
        int A002;
        WaTextView waTextView2 = this.A0N;
        if (waTextView2 != null) {
            waTextView2.setTextColor(this.A04);
            if (!this.A0U.A06()) {
                waTextView = this.A0N;
                A002 = R.string.f11nameremoved;
            } else {
                if (!(i == 0 || i == 1)) {
                    if (i == 2) {
                        this.A0N.setTextColor(this.A03);
                    } else if (i == 3) {
                        this.A0N.setText(R.string.f11nameremoved);
                        this.A0N.setTextColor(this.A05);
                        return;
                    } else if (!(i == 4 || i == 5)) {
                        return;
                    }
                }
                waTextView = this.A0N;
                A002 = SettingsUserProxyViewModel.A00(i);
            }
            waTextView.setText(A002);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        super.onActivityResult(i3, i4, intent2);
        if (i3 == 151) {
            if (i4 == -1) {
                A76();
                startActivity(C627736r.A12(this, this.A0c, (String) null, 1));
                return;
            }
        } else if (i3 == 1) {
            A76();
            return;
        } else if (i3 == 2) {
            if (i4 == -1 && intent != null && Build.VERSION.SDK_INT >= 30) {
                Uri data = intent2.getData();
                C54292oU r13 = this.A0O;
                C56612sH r12 = this.A06;
                C69263Wi r9 = this.A05;
                AnonymousClass4FS r15 = this.A04;
                C994355s r5 = new C994355s(this, this.A0I, this.A04, r9, this.A05, this.A08, r12, r13, this.A0Q, r15);
                this.A04.BkL(r5, data);
                return;
            }
            return;
        }
        Log.i("settings-data-usage-activity/onActivityResult/storage_permission denied/cant open StorageUsageActivity");
    }

    public void onCreate(Bundle bundle) {
        ViewStub viewStub;
        super.onCreate(bundle);
        this.A0Y = new C104675Rx(this.A06, this.A0a);
        if (C56972sr.A00(this.A01) == null) {
            startActivity(C627736r.A03(this));
            finish();
            return;
        }
        this.A0W = (SettingsDataUsageViewModel) AnonymousClass0x9.A0H(this).A01(SettingsDataUsageViewModel.class);
        setTitle(R.string.f11nameremoved);
        setContentView((int) R.layout.f8nameremoved);
        int A2I = AnonymousClass1Hf.A2I(this);
        this.A07 = new Handler(Looper.myLooper());
        this.A0f = getResources().getStringArray(R.array.f2nameremoved);
        this.A0g = getResources().getStringArray(R.array.f2nameremoved);
        this.A00 = AnonymousClass0x2.A0F(this.A09).getInt("autodownload_cellular_mask", 1);
        this.A02 = AnonymousClass1Hf.A27(this).getInt("autodownload_wifi_mask", 15);
        this.A01 = AnonymousClass1Hf.A27(this).getInt("autodownload_roaming_mask", 0);
        View findViewById = findViewById(R.id.setting_network_usage);
        this.A0A = C18310x6.A0L(this, R.id.setting_network_usage_details);
        View findViewById2 = findViewById(R.id.setting_storage_usage);
        this.A0G = C18310x6.A0L(this, R.id.setting_storage_usage_details);
        View findViewById3 = findViewById(R.id.setting_autodownload_cellular);
        this.A0B = C18310x6.A0L(this, R.id.setting_selected_autodownload_cellular);
        View findViewById4 = findViewById(R.id.setting_autodownload_wifi);
        this.A0D = C18310x6.A0L(this, R.id.setting_selected_autodownload_wifi);
        View findViewById5 = findViewById(R.id.setting_autodownload_roaming);
        this.A0C = C18310x6.A0L(this, R.id.setting_selected_autodownload_roaming);
        View findViewById6 = findViewById(R.id.settings_calls_low_data);
        this.A0H = (SwitchCompat) findViewById(R.id.low_data_calls_switch);
        this.A0F = C18310x6.A0L(this, R.id.setting_selected_video_quality);
        this.A0E = C18310x6.A0L(this, R.id.setting_selected_photo_quality);
        AnonymousClass1Ha.A1x(findViewById, this, 29);
        this.A0c = AnonymousClass297.A00(this.A0R, A2I);
        AnonymousClass1Ha.A1x(findViewById2, this, 31);
        this.A0B.setText(A75(this.A00));
        AnonymousClass1Ha.A1x(findViewById3, this, 32);
        this.A0D.setText(A75(this.A02));
        AnonymousClass1Ha.A1x(findViewById4, this, 33);
        this.A0C.setText(A75(this.A01));
        AnonymousClass1Ha.A1x(findViewById5, this, 34);
        View findViewById7 = findViewById(R.id.setting_video_quality);
        View findViewById8 = findViewById(R.id.setting_photo_quality);
        View findViewById9 = findViewById(R.id.media_quality_section);
        AnonymousClass1VX r1 = this.A0D;
        C58422vE r3 = C58422vE.A02;
        if (r1.A0Y(r3, 662)) {
            findViewById9.setVisibility(0);
            findViewById7.setVisibility(0);
        }
        if (this.A0D.A0Y(r3, 702) && !this.A0D.A0Y(r3, 2653)) {
            findViewById9.setVisibility(0);
            findViewById8.setVisibility(0);
        }
        this.A0L = new AnonymousClass5W4(this, this.A09, this.A00);
        AnonymousClass1Ha.A1x(findViewById7, this, 35);
        TextView textView = this.A0F;
        AnonymousClass5W4 r0 = this.A0L;
        textView.setText(r0.A00.getString(AnonymousClass5W4.A03[C18280x3.A02(AnonymousClass0x2.A0F(r0.A01), "video_quality")]));
        this.A0J = new AnonymousClass5W3(this, this.A09, this.A00);
        AnonymousClass1Ha.A1x(findViewById8, this, 36);
        TextView textView2 = this.A0E;
        AnonymousClass5W3 r02 = this.A0J;
        textView2.setText(r02.A00.getString(AnonymousClass5W3.A03[C18280x3.A02(AnonymousClass0x2.A0F(r02.A01), "photo_quality")]));
        this.A03 = C107405bG.A00(this, R.attr.f3nameremoved, R.color.f5nameremoved);
        this.A05 = C107405bG.A00(this, R.attr.f3nameremoved, R.color.f5nameremoved);
        this.A04 = C107405bG.A00(this, R.attr.f3nameremoved, R.color.f5nameremoved);
        AnonymousClass1VX r12 = this.A0W.A05;
        C58422vE r15 = C58422vE.A01;
        boolean A0Y2 = r12.A0Y(r15, 3641);
        View view = this.A00;
        int i = R.id.user_proxy_section;
        if (A0Y2) {
            i = R.id.user_proxy_section_v2;
        }
        ViewStub viewStub2 = (ViewStub) C06560Yg.A02(view, i);
        View inflate = viewStub2.inflate();
        this.A0N = AnonymousClass0x7.A0L(this.A00, R.id.proxy_connection_status);
        AnonymousClass1Ha.A1x(inflate, this, 27);
        if (this.A0D.A0Y(r3, 2784) || this.A0W.A05.A0Y(r15, 3641)) {
            viewStub2.setVisibility(0);
        } else {
            viewStub2.setVisibility(8);
        }
        if (this.A01.A0Y()) {
            findViewById6.setVisibility(8);
        } else {
            this.A0H.setChecked(AnonymousClass1Hf.A27(this).getBoolean("voip_low_data_usage", false));
            AnonymousClass1Ha.A1x(findViewById6, this, 28);
        }
        if (this.A0P.A0E()) {
            A76();
        } else {
            this.A0G.setVisibility(8);
        }
        this.A08 = findViewById(R.id.external_dir_migration_section);
        View findViewById10 = findViewById(R.id.manual_external_dir_migration);
        if (Build.VERSION.SDK_INT >= 30) {
            findViewById10.setOnClickListener(new C989653x(this, 49));
        }
        AnonymousClass08M r13 = this.A0W.A00;
        AnonymousClass1Ha.A22(this, r13, 338);
        Object A072 = r13.A07();
        View view2 = this.A08;
        if (view2 != null) {
            int i2 = 0;
            if (Boolean.TRUE != A072) {
                i2 = 8;
            }
            view2.setVisibility(i2);
        }
        AnonymousClass1Ha.A22(this, this.A0W.A01, 339);
        String A1q = AnonymousClass1Ha.A1q(this);
        this.A0b = A1q;
        this.A0X.A02(this.A00, "storage_and_data", A1q);
        this.A0b = null;
        if (this.A0T.A01.A0Y(r3, 5625) && (viewStub = (ViewStub) findViewById(R.id.newsletter_media_cache_viewstub)) != null) {
            viewStub.inflate();
            this.A09 = findViewById(R.id.settings_newsletters_media_cache_row);
            this.A0M = (WaTextView) findViewById(R.id.settings_newsletters_media_cache);
            A77(AnonymousClass1Hf.A27(this).getInt("newsletter_media_cache_purge_after", 0));
            AnonymousClass1Ha.A1x(this.A09, this, 30);
        }
        if (this.A0D.A0Y(r3, 4023)) {
            ((ImageView) findViewById(R.id.ic_setting_storage_usage)).setImageResource(R.drawable.ic_settings_storage_data_unfilled_folder);
            ((ImageView) findViewById(R.id.ic_setting_network_usage)).setImageResource(R.drawable.ic_settings_storage_data_unfilled_network_usage);
            View[] viewArr = new View[9];
            viewArr[0] = findViewById2;
            viewArr[A2I] = findViewById6;
            AnonymousClass001.A1H(inflate, findViewById3, viewArr);
            viewArr[4] = findViewById4;
            AnonymousClass0x2.A1D(findViewById5, findViewById8, findViewById7, viewArr);
            viewArr[8] = findViewById(R.id.manual_external_dir_migration_layout);
            int dimension = (int) getResources().getDimension(R.dimen.f6nameremoved);
            int i3 = 0;
            do {
                View view3 = viewArr[i3];
                view3.setPadding(dimension, view3.getPaddingTop(), view3.getPaddingRight(), view3.getPaddingBottom());
                i3++;
            } while (i3 < 9);
        }
    }

    public SettingsDataUsageActivity(int i) {
        this.A0e = false;
        AnonymousClass1Hf.A2D(this, 94);
    }

    public final String A75(int i) {
        String str;
        String str2;
        int i2;
        ArrayList A0s = AnonymousClass001.A0s();
        int i3 = 0;
        int i4 = 0;
        while (i != 0) {
            if ((i & 1) != 0) {
                A0s.add(Integer.toString(i4));
            }
            i >>= 1;
            i4++;
        }
        CharSequence[] charSequenceArr = (CharSequence[]) A0s.toArray(new CharSequence[0]);
        int length = charSequenceArr.length;
        String[] strArr = this.A0g;
        if (length == strArr.length) {
            i2 = R.string.f11nameremoved;
        } else if (length == 0) {
            i2 = R.string.f11nameremoved;
        } else {
            CharSequence charSequence = charSequenceArr[0];
            while (true) {
                if (i3 >= strArr.length) {
                    str = "";
                    break;
                }
                String charSequence2 = charSequence.toString();
                strArr = this.A0g;
                if (charSequence2.equals(strArr[i3])) {
                    str = this.A0f[i3];
                    break;
                }
                i3++;
            }
            StringBuilder A0A2 = C18330xA.A0A(str);
            for (int i5 = 1; i5 < length; i5++) {
                AnonymousClass001.A1M(A0A2);
                CharSequence charSequence3 = charSequenceArr[i5];
                int i6 = 0;
                while (true) {
                    if (i6 >= strArr.length) {
                        str2 = "";
                        break;
                    }
                    String charSequence4 = charSequence3.toString();
                    strArr = this.A0g;
                    if (charSequence4.equals(strArr[i6])) {
                        str2 = this.A0f[i6];
                        break;
                    }
                    i6++;
                }
                A0A2.append(str2);
            }
            return A0A2.toString();
        }
        return getString(i2);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0h.cancel();
        C18290x4.A1L(this.A0Z);
        C33711tZ r2 = this.A0V;
        if (r2 != null) {
            r2.A00.set(true);
            r2.A0D(true);
        }
        this.A06 = -1;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
        this.A0d.cancel();
    }

    public void onResume() {
        super.onResume();
        SettingsDataUsageViewModel settingsDataUsageViewModel = this.A0W;
        AnonymousClass1VX r1 = settingsDataUsageViewModel.A05;
        C58422vE r3 = C58422vE.A01;
        if (r1.A0Y(r3, 3641)) {
            AnonymousClass3Ci r4 = settingsDataUsageViewModel.A06;
            AnonymousClass08M r12 = settingsDataUsageViewModel.A01;
            Objects.requireNonNull(r12);
            r4.A03.A04(new C124266Bp(r12, 17), settingsDataUsageViewModel.A02.A08);
        }
        C118455tZ r5 = new C118455tZ(this);
        this.A0d = r5;
        this.A0h.scheduleAtFixedRate(r5, 0, 1000);
        SettingsDataUsageViewModel settingsDataUsageViewModel2 = this.A0W;
        C71293bs.A00(settingsDataUsageViewModel2.A07, settingsDataUsageViewModel2, 0);
        if (this.A0N == null) {
            return;
        }
        if (this.A0W.A05.A0Y(r3, 3641)) {
            A78(C18280x3.A02(this.A0U.A01.A03("user_proxy_setting_pref"), "proxy_connection_status"));
        } else if (this.A0D.A0Y(C58422vE.A02, 2784)) {
            WaTextView waTextView = this.A0N;
            boolean A062 = this.A0U.A06();
            int i = R.string.f11nameremoved;
            if (A062) {
                i = R.string.f11nameremoved;
            }
            waTextView.setText(i);
        }
    }

    public SettingsDataUsageActivity() {
        this(0);
        this.A0h = new Timer("refresh-network-usage");
        this.A06 = -1;
        this.A0b = null;
    }
}
