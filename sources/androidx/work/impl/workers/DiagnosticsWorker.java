package androidx.work.impl.workers;

import X.AnonymousClass000;
import X.AnonymousClass0FN;
import X.AnonymousClass0FO;
import X.AnonymousClass0GD;
import X.AnonymousClass0R5;
import X.AnonymousClass0SI;
import X.AnonymousClass0X4;
import X.AnonymousClass0XS;
import X.AnonymousClass0Xq;
import X.AnonymousClass0YN;
import X.C01410Ap;
import X.C02380Fy;
import X.C02920Ic;
import X.C02930Id;
import X.C03070Is;
import X.C06240Wu;
import X.C06250Wv;
import X.C06310Xb;
import X.C08700eu;
import X.C09140fi;
import X.C15400rH;
import X.C16170sa;
import X.C162457s7;
import X.C16770tw;
import X.C17060uV;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class DiagnosticsWorker extends Worker {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C162457s7.A0J(context, 1);
        C162457s7.A0J(workerParameters, 2);
    }

    /* JADX INFO: finally extract failed */
    public C03070Is A0C() {
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        C06310Xb A01 = C06310Xb.A01(this.A00);
        C162457s7.A0D(A01);
        WorkDatabase workDatabase = A01.A04;
        C162457s7.A0D(workDatabase);
        C17060uV A0J = workDatabase.A0J();
        C15400rH A0H = workDatabase.A0H();
        C16170sa A0K = workDatabase.A0K();
        C16770tw A0G = workDatabase.A0G();
        C08700eu A00 = C02920Ic.A00("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        A00.Axs(1, System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1));
        AnonymousClass0R5 r1 = ((C09140fi) A0J).A02;
        r1.A09();
        Cursor A002 = C02930Id.A00(r1, A00, false);
        try {
            int A02 = AnonymousClass0X4.A02(A002, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A022 = AnonymousClass0X4.A02(A002, "state");
            int A023 = AnonymousClass0X4.A02(A002, "worker_class_name");
            int A024 = AnonymousClass0X4.A02(A002, "input_merger_class_name");
            int A025 = AnonymousClass0X4.A02(A002, "input");
            int A026 = AnonymousClass0X4.A02(A002, "output");
            int A027 = AnonymousClass0X4.A02(A002, "initial_delay");
            int A028 = AnonymousClass0X4.A02(A002, "interval_duration");
            int A029 = AnonymousClass0X4.A02(A002, "flex_duration");
            int A0210 = AnonymousClass0X4.A02(A002, "run_attempt_count");
            int A0211 = AnonymousClass0X4.A02(A002, "backoff_policy");
            int A0212 = AnonymousClass0X4.A02(A002, "backoff_delay_duration");
            int A0213 = AnonymousClass0X4.A02(A002, "last_enqueue_time");
            int A0214 = AnonymousClass0X4.A02(A002, "minimum_retention_duration");
            int A0215 = AnonymousClass0X4.A02(A002, "schedule_requested_at");
            int A0216 = AnonymousClass0X4.A02(A002, "run_in_foreground");
            int A0217 = AnonymousClass0X4.A02(A002, "out_of_quota_policy");
            int A0218 = AnonymousClass0X4.A02(A002, "period_count");
            int A0219 = AnonymousClass0X4.A02(A002, "generation");
            int A0220 = AnonymousClass0X4.A02(A002, "required_network_type");
            int A0221 = AnonymousClass0X4.A02(A002, "requires_charging");
            int A0222 = AnonymousClass0X4.A02(A002, "requires_device_idle");
            int A0223 = AnonymousClass0X4.A02(A002, "requires_battery_not_low");
            int A0224 = AnonymousClass0X4.A02(A002, "requires_storage_not_low");
            int A0225 = AnonymousClass0X4.A02(A002, "trigger_content_update_delay");
            int A0226 = AnonymousClass0X4.A02(A002, "trigger_max_content_delay");
            int A0227 = AnonymousClass0X4.A02(A002, "content_uri_triggers");
            ArrayList A0o = AnonymousClass000.A0o(A002);
            while (A002.moveToNext()) {
                if (A002.isNull(A02)) {
                    str = null;
                } else {
                    str = A002.getString(A02);
                }
                AnonymousClass0GD A07 = AnonymousClass0YN.A07(A002.getInt(A022));
                if (A002.isNull(A023)) {
                    str2 = null;
                } else {
                    str2 = A002.getString(A023);
                }
                if (A002.isNull(A024)) {
                    str3 = null;
                } else {
                    str3 = A002.getString(A024);
                }
                if (A002.isNull(A025)) {
                    bArr = null;
                } else {
                    bArr = A002.getBlob(A025);
                }
                AnonymousClass0Xq A003 = AnonymousClass0Xq.A00(bArr);
                if (A002.isNull(A026)) {
                    bArr2 = null;
                } else {
                    bArr2 = A002.getBlob(A026);
                }
                AnonymousClass0Xq A004 = AnonymousClass0Xq.A00(bArr2);
                long j = A002.getLong(A027);
                long j2 = A002.getLong(A028);
                long j3 = A002.getLong(A029);
                int i = A002.getInt(A0210);
                AnonymousClass0FN A04 = AnonymousClass0YN.A04(A002.getInt(A0211));
                long j4 = A002.getLong(A0212);
                long j5 = A002.getLong(A0213);
                long j6 = A002.getLong(A0214);
                long j7 = A002.getLong(A0215);
                boolean A1S = AnonymousClass000.A1S(A002.getInt(A0216));
                AnonymousClass0FO A06 = AnonymousClass0YN.A06(A002.getInt(A0217));
                int i2 = A002.getInt(A0218);
                int i3 = A002.getInt(A0219);
                C02380Fy A05 = AnonymousClass0YN.A05(A002.getInt(A0220));
                boolean A1S2 = AnonymousClass000.A1S(A002.getInt(A0221));
                boolean A1S3 = AnonymousClass000.A1S(A002.getInt(A0222));
                boolean A1S4 = AnonymousClass000.A1S(A002.getInt(A0223));
                boolean A1S5 = AnonymousClass000.A1S(A002.getInt(A0224));
                long j8 = A002.getLong(A0225);
                long j9 = A002.getLong(A0226);
                if (A002.isNull(A0227)) {
                    bArr3 = null;
                } else {
                    bArr3 = A002.getBlob(A0227);
                }
                A0o.add(new C06250Wv(A04, new AnonymousClass0XS(A05, AnonymousClass0YN.A08(bArr3), j8, j9, A1S2, A1S3, A1S4, A1S5), A003, A004, A06, A07, str, str2, str3, i, i2, i3, j, j2, j3, j4, j5, j6, j7, A1S));
            }
            A002.close();
            A00.A01();
            List BCO = A0J.BCO();
            List B4O = A0J.B4O(200);
            if (!A0o.isEmpty()) {
                C06240Wu.A00();
                String str4 = AnonymousClass0SI.A00;
                Log.i(str4, "Recently completed work:\n\n");
                C06240Wu.A00();
                Log.i(str4, AnonymousClass0SI.A00(A0G, A0H, A0K, A0o));
            }
            if (!BCO.isEmpty()) {
                C06240Wu.A00();
                String str5 = AnonymousClass0SI.A00;
                Log.i(str5, "Running work:\n\n");
                C06240Wu.A00();
                Log.i(str5, AnonymousClass0SI.A00(A0G, A0H, A0K, BCO));
            }
            if (!B4O.isEmpty()) {
                C06240Wu.A00();
                String str6 = AnonymousClass0SI.A00;
                Log.i(str6, "Enqueued work:\n\n");
                C06240Wu.A00();
                Log.i(str6, AnonymousClass0SI.A00(A0G, A0H, A0K, B4O));
            }
            return new C01410Ap();
        } catch (Throwable th) {
            A002.close();
            A00.A01();
            throw th;
        }
    }
}
