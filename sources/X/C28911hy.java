package X;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Environment;
import android.text.TextUtils;
import androidx.preference.PreferenceScreen;
import com.whatsapp.R;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1hy  reason: invalid class name and case insensitive filesystem */
public class C28911hy extends C61102zi {
    public final C116985rC A00;
    public final C116985rC A01;
    public final C116985rC A02;
    public final C116985rC A03;
    public final C116985rC A04;
    public final C116985rC A05;
    public final C116985rC A06;
    public final C116985rC A07;
    public final C116985rC A08;
    public final C116985rC A09;
    public final C55682qk A0A;
    public final C69263Wi A0B;
    public final C56972sr A0C;
    public final C54042o5 A0D;
    public final AnonymousClass3DP A0E;
    public final AnonymousClass0N6 A0F;
    public final AnonymousClass0WN A0G;
    public final AnonymousClass2JS A0H;
    public final C105405Uu A0I;
    public final C56962sq A0J;
    public final C65203Gp A0K;
    public final C52282lE A0L;
    public final C113905mB A0M;
    public final C44872Xu A0N;
    public final C620633i A0O;
    public final C54292oU A0P;
    public final AnonymousClass5ZR A0Q;
    public final AnonymousClass33p A0R;
    public final C621133n A0S;
    public final C55272q5 A0T;
    public final C72303dV A0U;
    public final C47322d4 A0V;
    public final C49812h8 A0W;
    public final C49012fq A0X;
    public final AnonymousClass8EA A0Y;
    public final C67523Pp A0Z;
    public final AnonymousClass308 A0a;
    public final AnonymousClass1VX A0b;
    public final C621233o A0c;
    public final C55812qx A0d;
    public final C620133d A0e;
    public final AnonymousClass33S A0f;
    public final C619933b A0g;
    public final C197769dq A0h;
    public final AnonymousClass33X A0i;
    public final C29351ig A0j;
    public final C54612p0 A0k;
    public final AnonymousClass317 A0l;
    public final AnonymousClass1R1 A0m;
    public final C54972pa A0n;
    public final C69183Wa A0o;
    public final C187958y5 A0p;
    public final AnonymousClass4FS A0q;
    public final AnonymousClass2IU A0r;
    public final C55142pr A0s;
    public final C34171uL A0t;
    public final C183538qC A0u;
    public final C183538qC A0v;
    public final C183538qC A0w;
    public final Set A0x;
    public final AnonymousClass4C1 A0y;

    public void A08() {
        this.A0l.A0B(6, true);
        Iterator A032 = C61102zi.A03(this);
        while (A032.hasNext()) {
            ((AnonymousClass4CG) A032.next()).BVi();
        }
        C117165rU r11 = new C117165rU(this, 0, new AtomicInteger(2));
        AnonymousClass0N6 r1 = this.A0F;
        Context context = this.A0P.A00;
        C10170hV r9 = (C10170hV) r1.A00();
        String A0X2 = r9.A07.A0X();
        C56972sr r12 = r9.A00;
        if (C56972sr.A00(r12) == null || TextUtils.isEmpty(A0X2)) {
            Log.i("deleteacctconfirm/not registered or no google account so no google backup deletion");
            r11.run();
        } else {
            PhoneUserJid A052 = C56972sr.A05(r12);
            ConditionVariable conditionVariable = new ConditionVariable(false);
            AnonymousClass0EC r10 = new AnonymousClass0EC(conditionVariable, r9);
            ConditionVariable conditionVariable2 = new ConditionVariable(false);
            AnonymousClass0Z6 r2 = new AnonymousClass0Z6(conditionVariable2, r9, r10);
            new C627736r();
            context.bindService(C627736r.A0t(context, (String) null), r2, 1);
            Intent A0t2 = C627736r.A0t(context, "action_delete");
            A0t2.putExtra("account_name", A0X2);
            A0t2.putExtra("jid_user", A052.user);
            AnonymousClass4FS r13 = r9.A0A;
            r13.BkM(new C12760m5(context, A0t2, conditionVariable2));
            AnonymousClass0x7.A1B(new AnonymousClass0F3(context, conditionVariable2, conditionVariable, r9, r10, r11), r13);
        }
        this.A0f.A00();
        AnonymousClass0x9.A0S(this.A0v).A0F(false, 13);
        A0A(context, r11, false);
        if (Build.VERSION.SDK_INT >= 26) {
            AnonymousClass327.A00(context, this.A0O);
        }
        C55742qq r22 = (C55742qq) this.A0y.get();
        r22.A01.A07(-1);
        C49372gQ r4 = r22.A00.A01;
        try {
            C172228Ke r0 = r4.A00;
            r0.close();
            C172228Ke.A04(r0.A08);
            try {
                r4.A00 = C172228Ke.A00((AnonymousClass7EN) null, AnonymousClass002.A0A(C54292oU.A02(r4.A02), "bk_cache_dir"), 10485760);
            } catch (IOException unused) {
                Log.e("BkCacheSaveOnDiskHelper/const unable to initialize disk cache for bk cache");
            }
            r4.A01 = AnonymousClass001.A0t();
            r4.A00();
        } catch (IOException unused2) {
            Log.e("BkCacheSaveOnDiskHelper/clearAllEntries exception wile clearing all entries");
        }
    }

    public void A09() {
        Context context = this.A0P.A00;
        String A0X2 = AnonymousClass000.A0X("_preferences", C18320x8.A0k(context));
        SharedPreferences sharedPreferences = context.getSharedPreferences("_has_set_default_values", 0);
        AnonymousClass0Pz r1 = new AnonymousClass0Pz(context);
        r1.A08 = A0X2;
        r1.A03 = null;
        r1.A03 = null;
        r1.A02(context, (PreferenceScreen) null, R.xml.f13nameremoved);
        C18270x1.A0f(sharedPreferences.edit(), "_has_set_default_values");
    }

    public final void A0A(Context context, Runnable runnable, boolean z) {
        Set emptySet;
        C620133d r4 = this.A0e;
        synchronized (r4.A0Q) {
            Iterator it = r4.A04().iterator();
            while (it.hasNext()) {
                r4.A0E(C18320x8.A0S(it), true, true);
            }
        }
        this.A0g.A0D(false);
        C105405Uu r1 = this.A0I;
        synchronized (r1) {
            r1.A01.clear();
            r1.A02.clear();
            r1.A03.clear();
        }
        C69263Wi.A00(this.A0B, this, 23);
        this.A0k.A01();
        AnonymousClass317 r2 = this.A0l;
        r2.A08();
        C54042o5 r0 = this.A0D;
        r0.A01 = false;
        r0.A00 = null;
        r0.A07.A1h((String) null, (String) null);
        this.A0J.A08();
        r2.A0D((String) null, (String) null, (String) null);
        this.A0h.A01(true, true);
        Context context2 = this.A0P.A00;
        AnonymousClass4FS r42 = this.A0q;
        r42.BkM(new C172708Mj(this, context2, runnable, 26));
        Log.i("deleteaccountconfirm/removeDatabasesAndResetState() done");
        File filesDir = context.getFilesDir();
        filesDir.toString();
        for (int i = 0; i < context.fileList().length; i++) {
        }
        if (z) {
            emptySet = Collections.singleton("Logs");
        } else {
            emptySet = Collections.emptySet();
        }
        C627536m.A0G(filesDir, emptySet);
        r42.BkM(new C172578Lw(5));
        C113905mB r22 = this.A0M;
        synchronized (r22) {
            r22.A01().edit().clear().commit();
            C60862zI r12 = r22.A0B;
            r12.A02().edit().clear().commit();
            r12.A01().edit().clear().commit();
        }
        String externalStorageState = Environment.getExternalStorageState();
        C18260x0.A0s("deleteacctconfirm/externalmedia-state ", externalStorageState, AnonymousClass001.A0o());
        if (this.A0Q.A0I(externalStorageState)) {
            C06550Ye.A0J(((C10170hV) this.A0F.A00()).A04);
        }
        this.A0E.A02();
        SharedPreferences sharedPreferences = context.getSharedPreferences(AnonymousClass000.A0X("_preferences", C18320x8.A0k(context)), 0);
        if (!sharedPreferences.edit().clear().commit()) {
            Log.e("deleteacctconfirm/cleanup/clear failed");
        }
        A09();
        if (!sharedPreferences.edit().putString("version", "2.23.26.14").commit()) {
            Log.e("deleteacctconfirm/cleanup/setversion failed");
        }
        AnonymousClass33p r43 = this.A0R;
        String A0X2 = r43.A0X();
        C18270x1.A03(r43).remove(AnonymousClass000.A0V("gdrive_last_successful_backup_timestamp:", A0X2, AnonymousClass001.A0o())).remove(AnonymousClass000.A0V("gdrive_last_successful_backup_total_size:", A0X2, AnonymousClass001.A0o())).remove(AnonymousClass000.A0V("gdrive_last_successful_backup_media_size:", A0X2, AnonymousClass001.A0o())).remove(AnonymousClass000.A0V("gdrive_last_successful_backup_video_size:", A0X2, AnonymousClass001.A0o())).remove(AnonymousClass000.A0V("gdrive_last_successful_backup_encrypted:", A0X2, AnonymousClass001.A0o())).remove("gdrive_restore_start_timestamp").remove("gdrive_backup_start_timestamp").remove("gdrive_next_prompt_for_setup_timestamp").remove("gdrive_error_code").remove("interface_gdrive_backup_frequency").remove("gdrive_already_downloaded_bytes").remove("gdrive_restore_overwrite_local_files").remove("gdrive_media_restore_network_setting").remove("gdrive_old_media_encryption_status").remove("gdrive_old_media_encryption_start_time").remove("gdrive_last_restore_file_is_encrypted").remove("gdrive_successive_backup_failed_count").remove("gdrive_already_uploaded_bytes").remove("gdrive_user_initiated_backup").remove("gdrive_state").remove("gdrive_activity_state").remove("gdrive_activity_msgstore_init_key").remove("interface_gdrive_backup_network_setting").remove("gdrive_include_videos_in_backup").remove("gdrive_backup_filters").remove("gdrive_approx_media_download_size").remove("gdrive_account_name").remove("gdrive_setup_user_prompted_count").commit();
        if (this.A0b.A0Y(C58422vE.A02, 4471)) {
            C18270x1.A0g(C18270x1.A03(r43), "contactless_jids_store");
        }
        C44872Xu r13 = this.A0N;
        C55262q4.A00(r13.A00).clear().commit();
        SharedPreferences sharedPreferences2 = r13.A01.A01;
        sharedPreferences2.edit().putInt("registration_device_id", 0).commit();
        sharedPreferences2.edit().putInt("companion_registration_state", 0).commit();
    }

    public void A0B(boolean z) {
        C54412og.A00(this.A0N.A01).putInt("companion_registration_state", 9).commit();
        Iterator A032 = C61102zi.A03(this);
        while (A032.hasNext()) {
            ((AnonymousClass4CG) A032.next()).BVi();
        }
        C06310Xb A012 = C72333dY.A01(this.A0t);
        A012.A06.B2t(new AnonymousClass0BN(A012));
        Context context = this.A0P.A00;
        this.A0f.A00();
        boolean z2 = false;
        AnonymousClass0x9.A0S(this.A0v).A0F(false, 13);
        if (z) {
            this.A0L.A02(true);
        }
        AnonymousClass1VX r2 = this.A0b;
        if (r2.A0Y(C58422vE.A02, 2489)) {
            try {
                ActivityManager A062 = this.A0O.A06();
                if (A062 == null) {
                    Runtime.getRuntime().exec(AnonymousClass000.A0V("pm clear ", context.getPackageName(), AnonymousClass001.A0o()));
                    return;
                } else if (A062.clearApplicationUserData()) {
                    return;
                }
            } catch (IOException | SecurityException e) {
                this.A0A.A09("DeleteAccount/clearApplicationUserData/failed to clear, falling back to old cleanup flow", e.getMessage(), e);
            }
        } else if (this.A0C.A0Y()) {
            z2 = C56952sp.A0K(r2, 624, false);
        }
        A0A(context, (Runnable) null, z2);
    }

    public C28911hy(C116985rC r2, C116985rC r3, C116985rC r4, C116985rC r5, C116985rC r6, C116985rC r7, C116985rC r8, C116985rC r9, C116985rC r10, C116985rC r11, C55682qk r12, C69263Wi r13, C56972sr r14, C54042o5 r15, AnonymousClass3DP r16, AnonymousClass0N6 r17, AnonymousClass0WN r18, AnonymousClass2JS r19, C105405Uu r20, C56962sq r21, C65203Gp r22, C52282lE r23, C113905mB r24, C44872Xu r25, C620633i r26, C54292oU r27, AnonymousClass5ZR r28, AnonymousClass33p r29, C621133n r30, C55272q5 r31, C72303dV r32, C47322d4 r33, C49812h8 r34, C49012fq r35, AnonymousClass8EA r36, C67523Pp r37, AnonymousClass308 r38, AnonymousClass1VX r39, C621233o r40, C55812qx r41, C620133d r42, AnonymousClass33S r43, C619933b r44, C197769dq r45, AnonymousClass33X r46, C29351ig r47, C54612p0 r48, AnonymousClass317 r49, AnonymousClass1R1 r50, C54972pa r51, C69183Wa r52, C187958y5 r53, AnonymousClass4FS r54, AnonymousClass2IU r55, C55142pr r56, C34171uL r57, C183538qC r58, C183538qC r59, C183538qC r60, C183538qC r61, Set set, AnonymousClass4C1 r63) {
        super(r61);
        this.A0b = r39;
        this.A0B = r13;
        this.A0D = r15;
        this.A0A = r12;
        this.A0C = r14;
        this.A0P = r27;
        this.A0q = r54;
        this.A0u = r58;
        this.A0f = r43;
        this.A04 = r3;
        this.A0K = r22;
        this.A0s = r56;
        this.A0Y = r36;
        this.A07 = r2;
        this.A0F = r17;
        this.A0p = r53;
        this.A0O = r26;
        this.A0y = r63;
        this.A0t = r57;
        this.A0J = r21;
        this.A0G = r18;
        this.A0n = r51;
        this.A0M = r24;
        this.A0m = r50;
        this.A0W = r34;
        this.A0H = r19;
        this.A0d = r41;
        this.A0S = r30;
        this.A0i = r46;
        this.A0E = r16;
        this.A0a = r38;
        this.A0o = r52;
        this.A0I = r20;
        this.A0g = r44;
        this.A0U = r32;
        this.A0l = r49;
        this.A09 = r4;
        this.A0Q = r28;
        this.A0R = r29;
        this.A0X = r35;
        this.A0N = r25;
        this.A0L = r23;
        this.A0Z = r37;
        this.A0e = r42;
        this.A0v = r59;
        this.A08 = r5;
        this.A0r = r55;
        this.A00 = r6;
        this.A0c = r40;
        this.A06 = r7;
        this.A05 = r8;
        this.A02 = r9;
        this.A0h = r45;
        this.A0V = r33;
        this.A0j = r47;
        this.A0k = r48;
        this.A0T = r31;
        this.A0w = r60;
        this.A01 = r10;
        this.A0x = set;
        this.A03 = r11;
    }
}
