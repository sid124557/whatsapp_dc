package com.whatsapp.companiondevice;

import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass122;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1RU;
import X.AnonymousClass1VX;
import X.AnonymousClass2FN;
import X.AnonymousClass2R8;
import X.AnonymousClass33G;
import X.AnonymousClass33Z;
import X.AnonymousClass33p;
import X.AnonymousClass3DZ;
import X.AnonymousClass3H2;
import X.AnonymousClass4H2;
import X.AnonymousClass4HY;
import X.AnonymousClass4I1;
import X.AnonymousClass5WX;
import X.C04640Qa;
import X.C08310eF;
import X.C105045Tj;
import X.C107695bk;
import X.C111095hX;
import X.C116985rC;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C18320x8;
import X.C183538qC;
import X.C29041iB;
import X.C46362bV;
import X.C50472iE;
import X.C50492iG;
import X.C54552ou;
import X.C55682qk;
import X.C56612sH;
import X.C613730l;
import X.C620633i;
import X.C620733j;
import X.C64333Db;
import X.C66433Lk;
import X.C66653Mg;
import X.C69263Wi;
import X.C71313bu;
import X.C85804Hr;
import X.C88744aj;
import X.C89644eZ;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;

public class LinkedDevicesActivity extends C89644eZ implements DialogInterface.OnDismissListener {
    public int A00;
    public RecyclerView A01;
    public C116985rC A02;
    public C116985rC A03;
    public C46362bV A04;
    public AnonymousClass3H2 A05;
    public AnonymousClass122 A06;
    public LinkedDevicesDetailDialogFragment A07;
    public LinkedDevicesSharedViewModel A08;
    public C50492iG A09;
    public LinkedDevicesViewModel A0A;
    public C613730l A0B;
    public C54552ou A0C;
    public C105045Tj A0D;
    public C29041iB A0E;
    public AnonymousClass33Z A0F;
    public AnonymousClass2R8 A0G;
    public C66653Mg A0H;
    public AnonymousClass5WX A0I;
    public C66433Lk A0J;
    public boolean A0K;
    public boolean A0L;
    public final C04640Qa A0M;

    public void onDismiss(DialogInterface dialogInterface) {
        this.A07 = null;
    }

    public void A5r() {
        if (!this.A0L) {
            this.A0L = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r2 = A002.A00;
            AnonymousClass1Ha.A23(A002, r2, r2, this);
            AnonymousClass1Ha.A24(A002, this);
            C88744aj r3 = C88744aj.A00;
            this.A02 = r3;
            this.A0J = C64333Db.A8X(A002);
            this.A0D = r2.AKk();
            this.A0H = (C66653Mg) A002.AN6.get();
            this.A0G = (AnonymousClass2R8) A002.AWC.get();
            this.A03 = r3;
            this.A0F = (AnonymousClass33Z) A002.A85.get();
            this.A0E = C64333Db.A3S(A002);
            this.A0B = (C613730l) A002.AY1.get();
            this.A04 = (C46362bV) A002.A5o.get();
            this.A0I = (AnonymousClass5WX) r2.A9K.get();
            this.A0C = (C54552ou) A002.A5k.get();
            this.A05 = (AnonymousClass3H2) A002.A89.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        boolean A2I = AnonymousClass1Hf.A2I(this);
        setContentView((int) R.layout.f8nameremoved);
        this.A08 = (LinkedDevicesSharedViewModel) AnonymousClass0x9.A0H(this).A01(LinkedDevicesSharedViewModel.class);
        this.A0A = (LinkedDevicesViewModel) AnonymousClass0x9.A0H(this).A01(LinkedDevicesViewModel.class);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.linked_device_recycler_view);
        this.A01 = recyclerView;
        C18320x8.A19(recyclerView, A2I ? 1 : 0);
        AnonymousClass2FN r7 = new AnonymousClass2FN(this);
        C56612sH r10 = this.A06;
        AnonymousClass1VX r14 = this.A0D;
        C69263Wi r6 = this.A05;
        C111095hX r5 = this.A00;
        C66433Lk r2 = this.A0J;
        C620633i r9 = this.A08;
        C620733j r11 = this.A00;
        C66653Mg r15 = this.A0H;
        AnonymousClass33Z r13 = this.A0F;
        AnonymousClass122 r4 = new AnonymousClass122(r5, r6, r7, this.A0B, r9, r10, r11, this.A0E, r13, r14, r15, r2);
        this.A06 = r4;
        this.A01.setAdapter(r4);
        this.A06.BiZ(this.A0M);
        this.A00 = getIntent().getIntExtra("entry_point", A2I);
        AnonymousClass1VX r52 = this.A0D;
        C69263Wi r102 = this.A05;
        C55682qk r92 = this.A03;
        C50492iG r62 = new C50492iG(this.A02, this.A03, r92, r102, this, this.A06, this.A08, this.A0G, r52);
        this.A09 = r62;
        r62.A00();
        AnonymousClass1Ha.A21(this, this.A08.A0W, 53);
        AnonymousClass1Ha.A21(this, this.A08.A0V, 54);
        AnonymousClass1Ha.A21(this, this.A08.A0U, 55);
        AnonymousClass1Ha.A21(this, this.A0A.A09, 56);
        AnonymousClass1Ha.A21(this, this.A0A.A08, 57);
        AnonymousClass1Ha.A21(this, this.A0A.A06, 58);
        AnonymousClass1Ha.A21(this, this.A0A.A07, 59);
        this.A08.A0D();
        this.A0A.A0E();
        AnonymousClass33p r3 = this.A0H.A01;
        if ((!r3.A2B()) && !C18280x3.A1W(AnonymousClass0x2.A0F(r3), "md_opt_in_first_time_experience_shown")) {
            C18270x1.A0v(this.A09, "md_opt_in_first_time_experience_shown", true);
            Log.d("OptInWebUpdate/First_Time_Experience");
            C50472iE r42 = new C50472iE();
            r42.A02 = R.layout.f8nameremoved;
            C85804Hr r22 = new C85804Hr(this, 44);
            r42.A04 = R.string.f11nameremoved;
            r42.A07 = r22;
            r42.A01(new AnonymousClass4I1(0), R.string.f11nameremoved);
            r42.A00().A1O(getSupportFragmentManager(), "first_time_experience_dialog");
        }
        AnonymousClass3H2 r53 = this.A05;
        if (r53.A03()) {
            C183538qC r43 = r53.A06.A01;
            boolean z = C18300x5.A0B(r43).getBoolean("adv_key_index_list_require_update", false);
            int i = C18300x5.A0B(r43).getInt("adv_key_index_list_update_retry_count", 0);
            if (z || i > 0) {
                Log.i("DeviceKeyIndexListUpdateHandler/onDevicesLoadedOnScreen/updating");
                r53.A00();
            }
        }
    }

    public void onDestroy() {
        AnonymousClass122 r0 = this.A06;
        r0.A01.unregisterObserver(this.A0M);
        this.A08.A0E();
        super.onDestroy();
    }

    public void onSaveInstanceState(Bundle bundle) {
        DialogFragment dialogFragment;
        LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment = this.A07;
        if (linkedDevicesDetailDialogFragment != null) {
            linkedDevicesDetailDialogFragment.A1L();
        }
        DialogFragment dialogFragment2 = (DialogFragment) getSupportFragmentManager().A0D("first_time_experience_dialog");
        if (dialogFragment2 != null) {
            dialogFragment2.A1L();
        }
        C08310eF A0D2 = this.A09.A05.getSupportFragmentManager().A0D("wifi_speed_bump_dialog");
        if ((A0D2 instanceof WifiSpeedBumpDialogFragment) && (dialogFragment = (DialogFragment) A0D2) != null) {
            dialogFragment.A1L();
        }
        super.onSaveInstanceState(bundle);
    }

    public LinkedDevicesActivity(int i) {
        this.A0L = false;
        AnonymousClass4HY.A00(this, 43);
    }

    public final void A74(List list) {
        boolean z;
        if (!isFinishing() && list != null) {
            AnonymousClass122 r5 = this.A06;
            List list2 = r5.A00;
            list2.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass33G r0 = (AnonymousClass33G) it.next();
                AnonymousClass1RU r2 = new AnonymousClass1RU(r0);
                Boolean bool = (Boolean) r5.A03.get(r0.A07);
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    z = true;
                    if (booleanValue) {
                        r2.A00 = z;
                        list2.add(r2);
                    }
                }
                z = false;
                r2.A00 = z;
                list2.add(r2);
            }
            r5.A0K();
            r5.A05();
            LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment = this.A07;
            if (linkedDevicesDetailDialogFragment != null && linkedDevicesDetailDialogFragment.A07 != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    AnonymousClass33G r22 = (AnonymousClass33G) it2.next();
                    if (r22.A07.equals(this.A07.A07.A07)) {
                        LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment2 = this.A07;
                        linkedDevicesDetailDialogFragment2.A07 = r22;
                        linkedDevicesDetailDialogFragment2.A0A = null;
                        if (linkedDevicesDetailDialogFragment2.A01 != null) {
                            linkedDevicesDetailDialogFragment2.A1U();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            this.A0A.A0E();
        } else if (i != 101) {
            if (i == 12345) {
                this.A09.A01(i2);
            }
        } else if (i2 == -1 && intent != null && intent.getBooleanExtra("has_removed_all_devices", false)) {
            Log.i("LinkedDevicesActivity/onActivityResult removedAllDevices");
            C69263Wi r2 = this.A05;
            r2.A02.post(C71313bu.A00(this, 38));
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C69263Wi.A03(this.A05, this, 39);
    }

    public void onStart() {
        super.onStart();
        LinkedDevicesSharedViewModel linkedDevicesSharedViewModel = this.A08;
        linkedDevicesSharedViewModel.A0Y.BkM(C71313bu.A00(linkedDevicesSharedViewModel, 45));
    }

    public void onStop() {
        super.onStop();
        LinkedDevicesSharedViewModel linkedDevicesSharedViewModel = this.A08;
        Runnable runnable = linkedDevicesSharedViewModel.A02;
        if (runnable != null) {
            linkedDevicesSharedViewModel.A0Y.BjN(runnable);
        }
    }

    public LinkedDevicesActivity() {
        this(0);
        this.A0K = false;
        this.A0M = new AnonymousClass4H2(this, 1);
    }
}
