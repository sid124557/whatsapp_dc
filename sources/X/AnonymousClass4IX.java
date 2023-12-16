package X;

import com.whatsapp.report.BusinessActivityReportViewModel;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.4IX  reason: invalid class name */
public class AnonymousClass4IX implements AnonymousClass4EV {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4IX(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public /* synthetic */ void BRU(long j) {
        if (3 - this.A02 == 0) {
            AnonymousClass1I7 r5 = (AnonymousClass1I7) this.A01;
            r5.A0C(j);
            C56902sk r3 = r5.A0d;
            r3.A0B(j);
            AnonymousClass5LM r0 = r5.A01;
            if (r0 != null) {
                r0.A0A = j;
            }
            try {
                C47662dc r02 = r5.A0e;
                File file = r02.A0C;
                if (r02.A02 == 2 && file != null && j >= 65536) {
                    C158207jb r1 = (C158207jb) ((C183538qC) this.A00).get();
                    if (r1.A00 == 0 && !r1.A01(j)) {
                        if (r1.A00 == 1) {
                            C64393Dh.A00(r5.A0B, AnonymousClass000.A0X(".chck", C18320x8.A0l(file))).createNewFile();
                            r3.A0G(C59132wP.A00(file, (int) j));
                            return;
                        }
                        throw new C143346yj();
                    }
                }
            } catch (C143346yj | IOException e) {
                Log.e("MediaDownload/maybeCreateStreamCheckSuccessFile", e);
            }
        }
    }

    public /* synthetic */ void BRW(boolean z) {
        if (4 - this.A02 == 0) {
            C18260x0.A1E("BusinessActivityReportManager/download-report/on-download-canceled transferred -> ", AnonymousClass001.A0o(), z);
            if (!z) {
                C55402qI r2 = (C55402qI) this.A00;
                File A09 = r2.A01.A09();
                if (A09.exists() && !A09.delete()) {
                    Log.e("BusinessActivityReportManager/reset/failed-delete-report-file");
                }
                C18270x1.A0h(C18270x1.A03(r2.A03), "business_activity_report_state", 2);
            }
        }
    }

    public final void BRX(C625435m r6, C56902sk r7) {
        String str;
        AnonymousClass33C r1;
        switch (this.A02) {
            case 0:
                C65193Go r2 = (C65193Go) this.A00;
                C624134x r12 = (C624134x) this.A01;
                if (AnonymousClass000.A1T(r6.A01)) {
                    r2.A0R.A0Z(r12);
                    return;
                }
                return;
            case 1:
                C65193Go r4 = (C65193Go) this.A00;
                AnonymousClass1nE r3 = (AnonymousClass1nE) ((C30471mV) this.A01);
                if (AnonymousClass000.A1T(r6.A01) && (r1 = r3.A01) != null) {
                    r1.A0F = r7.A03();
                    r4.A0y.A00(r3, new AnonymousClass4IK(r4, 1, r3));
                    return;
                }
                return;
            case 2:
                C624134x r32 = (C624134x) this.A00;
                C47332d5 r22 = (C47332d5) this.A01;
                C162457s7.A0J(r6, 2);
                if (AnonymousClass000.A1T(r6.A01)) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    C18260x0.A0m(C624134x.A08(r32, "BotPluginDownloadManager/downloadSuccess, refreshing thumbnail for ", A0o), A0o);
                    C69263Wi.A0A(r22.A01, r22, r32, 27);
                    return;
                }
                return;
            case 3:
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("mediadownload/plainfiledownload/ondownloadcomplete Complete download for url: ");
                A0o2.append(((AnonymousClass1I7) this.A01).A0e.A0L);
                A0o2.append(" result is: ");
                int i = r6.A01;
                if (AnonymousClass000.A1T(i) || i == 14) {
                    str = "success";
                } else {
                    str = "failure";
                }
                C18260x0.A1J(A0o2, str);
                return;
            default:
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("BusinessActivityReportManager/download-report/on-download-completed success -> ");
                boolean A1T = AnonymousClass000.A1T(r6.A01);
                C18260x0.A1V(A0o3, A1T);
                if (A1T) {
                    C55402qI r33 = (C55402qI) this.A00;
                    synchronized (r33) {
                        C18270x1.A0h(C18270x1.A03(r33.A03), "business_activity_report_state", 4);
                    }
                    Log.i("BusinessActivityReportViewModel/download-report/on-success");
                    BusinessActivityReportViewModel businessActivityReportViewModel = ((C103285Mh) this.A01).A00;
                    C06270Wx.A04(businessActivityReportViewModel.A02, businessActivityReportViewModel.A05.A00());
                    return;
                }
                Log.i("BusinessActivityReportViewModel/download-report/on-error");
                BusinessActivityReportViewModel businessActivityReportViewModel2 = ((C103285Mh) this.A01).A00;
                BusinessActivityReportViewModel.A00(businessActivityReportViewModel2);
                C06270Wx.A04(businessActivityReportViewModel2.A01, 5);
                C18270x1.A0h(C18270x1.A03(((C55402qI) this.A00).A03), "business_activity_report_state", 2);
                return;
        }
    }

    public AnonymousClass4IX(AnonymousClass1I7 r2) {
        this.A02 = 3;
        this.A01 = r2;
        this.A00 = C72333dY.A05(this, 24);
    }
}
