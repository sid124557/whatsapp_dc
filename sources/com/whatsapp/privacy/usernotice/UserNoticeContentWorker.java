package com.whatsapp.privacy.usernotice;

import X.AnonymousClass001;
import X.AnonymousClass0Q9;
import X.AnonymousClass0Xq;
import X.AnonymousClass0x9;
import X.AnonymousClass1kT;
import X.AnonymousClass1kU;
import X.AnonymousClass33K;
import X.AnonymousClass3PZ;
import X.AnonymousClass4GL;
import X.C01390An;
import X.C01400Ao;
import X.C01410Ap;
import X.C03070Is;
import X.C162457s7;
import X.C18260x0;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C389229y;
import X.C51922kb;
import X.C53722nY;
import X.C55132pq;
import X.C56492s4;
import X.C61112zj;
import X.C623034m;
import X.C624535b;
import X.C626936e;
import X.C64333Db;
import android.content.Context;
import android.net.TrafficStats;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class UserNoticeContentWorker extends Worker {
    public final C56492s4 A00;
    public final AnonymousClass33K A01;
    public final C623034m A02;
    public final C61112zj A03;
    public final C51922kb A04;
    public final C55132pq A05;

    public C03070Is A0C() {
        C03070Is r1;
        C53722nY r3;
        WorkerParameters workerParameters = this.A01;
        AnonymousClass0Xq r2 = workerParameters.A01;
        int A022 = r2.A02("notice_id", -1);
        String A032 = r2.A03("url");
        if (A022 == -1 || A032 == null || workerParameters.A00 > 4) {
            this.A04.A02(C18280x3.A0S());
            return new C01400Ao();
        }
        TrafficStats.setThreadStatsTag(16);
        try {
            AnonymousClass4GL A012 = this.A01.A01(this.A05, A032, (String) null);
            try {
                if (((AnonymousClass3PZ) A012).A01.getResponseCode() != 200) {
                    this.A04.A02(C18280x3.A0S());
                    r1 = new C01390An();
                } else {
                    byte[] A052 = C624535b.A05(C18310x6.A0b(this.A00, A012, (Integer) null, 27));
                    ByteArrayInputStream A0d = AnonymousClass0x9.A0d(A052);
                    C61112zj r12 = this.A03;
                    JSONObject A023 = C624535b.A02(A0d);
                    C626936e.A06(A023);
                    C162457s7.A0H(A023);
                    r3 = r12.A01(A023, A022);
                    if (r3 == null) {
                        C18260x0.A0y("UserNoticeContentManager/storeUserNoticeContent/cannot parse response for notice: ", AnonymousClass001.A0o(), A022);
                        this.A04.A02(C18290x4.A0a());
                        r1 = new C01390An();
                    } else {
                        if (!this.A02.A08(AnonymousClass0x9.A0d(A052), "content.json", A022)) {
                            r1 = new C01390An();
                        } else {
                            ArrayList A0s = AnonymousClass001.A0s();
                            ArrayList A0s2 = AnonymousClass001.A0s();
                            AnonymousClass1kT r13 = r3.A02;
                            if (r13 != null) {
                                A0s.add("banner_icon_light.png");
                                A0s2.add(r13.A03);
                                A0s.add("banner_icon_dark.png");
                                A0s2.add(r13.A02);
                            }
                            AnonymousClass1kU r14 = r3.A04;
                            if (r14 != null) {
                                A0s.add("modal_icon_light.png");
                                A0s2.add(r14.A06);
                                A0s.add("modal_icon_dark.png");
                                A0s2.add(r14.A05);
                            }
                            AnonymousClass1kU r15 = r3.A03;
                            if (r15 != null) {
                                A0s.add("blocking_modal_icon_light.png");
                                A0s2.add(r15.A06);
                                A0s.add("blocking_modal_icon_dark.png");
                                A0s2.add(r15.A05);
                            }
                            AnonymousClass0Q9 r32 = new AnonymousClass0Q9();
                            String[] A1b = C18300x5.A1b(A0s);
                            Map map = r32.A00;
                            map.put("file_name_list", A1b);
                            map.put("url_list", C18300x5.A1b(A0s2));
                            r1 = new C01410Ap(r32.A00());
                        }
                    }
                }
            } catch (IOException | JSONException e) {
                Log.e(C18260x0.A05("Failed to parse user notice content for notice id: ", A022), e);
                r3 = null;
            } catch (Throwable th) {
                A012.close();
                throw th;
            }
            A012.close();
            TrafficStats.clearThreadStatsTag();
            return r1;
        } catch (IOException e2) {
            try {
                Log.e("UserNoticeContentWorker/doWork/fetch failed ", e2);
                this.A04.A02(C18280x3.A0S());
                return new C01400Ao();
            } finally {
                TrafficStats.clearThreadStatsTag();
            }
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public UserNoticeContentWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        Log.d("usernoticecontent/hilt");
        C64333Db A012 = C389229y.A01(context);
        this.A00 = A012.Bq6();
        this.A04 = (C51922kb) A012.AZZ.get();
        this.A05 = (C55132pq) A012.AU8.get();
        this.A01 = (AnonymousClass33K) A012.AaW.get();
        this.A02 = (C623034m) A012.AZX.get();
        this.A03 = (C61112zj) A012.AZY.get();
    }
}
