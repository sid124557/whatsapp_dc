package X;

import com.whatsapp.privacy.usernotice.UserNoticeStageUpdateWorker;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.33X  reason: invalid class name */
public class AnonymousClass33X {
    public final C55682qk A00;
    public final C56612sH A01;
    public final C57162tC A02;
    public final AnonymousClass1VX A03;
    public final C623034m A04;
    public final C55772qt A05;
    public final C51072jE A06;
    public final C34171uL A07;

    public static C61202zs A00(C53722nY r2, int i) {
        AnonymousClass1kU r0;
        if (!(i == 0 || i == 1)) {
            if (i != 2) {
                if (i == 3) {
                    r0 = r2.A04;
                } else if (i == 4) {
                    r0 = r2.A03;
                } else if (i != 5) {
                    throw AnonymousClass001.A0e(AnonymousClass000.A0Y("Unexpected value: ", AnonymousClass001.A0o(), i));
                }
                if (r0 != null) {
                    return r0.A00;
                }
            } else {
                AnonymousClass1kT r02 = r2.A02;
                if (r02 != null) {
                    return r02.A00;
                }
            }
        }
        return null;
    }

    public AnonymousClass1kT A01() {
        C55772qt r9 = this.A05;
        C622234e A022 = r9.A02();
        if (A022 == null || A022.A00 != 2) {
            return null;
        }
        int i = A022.A01;
        AnonymousClass1VX r6 = this.A03;
        if (AnonymousClass31f.A00(r6, i)) {
            C18260x0.A0y("UserNoticeManager/getBanner/green alert disabled, notice: ", AnonymousClass001.A0o(), i);
            return null;
        }
        C53722nY A032 = this.A04.A03(A022);
        if (A032 == null) {
            return null;
        }
        AnonymousClass1kT r4 = A032.A02;
        if (r4 == null) {
            Log.e("UserNoticeManager/getBanner/no content for stage 2");
            this.A00.A0A("UserNoticeManager/getBanner/noContent", true, (String) null);
            return null;
        }
        if (AnonymousClass31f.A01(r6, A022)) {
            if (this.A01.A0H() < AnonymousClass0x2.A0B(r9.A01(), "current_user_notice_banner_dismiss_timestamp") + 86400000) {
                Log.i("UserNoticeManager/getBanner/dismissed banner not shown as per timing");
                return null;
            }
            Log.i("UserNoticeManager/getBanner/eligible to show dismissible banner");
            C18270x1.A0o(r9.A01(), "current_user_notice_banner_dismiss_timestamp", 0);
        }
        C61202zs r1 = r4.A00;
        if (!A0B(r1)) {
            Log.i("UserNoticeManager/getBanner/banner not shown as per timing");
            return null;
        }
        A09(r1, AnonymousClass31f.A01(r6, A022));
        Log.i("UserNoticeManager/getBanner/banner shown");
        return r4;
    }

    public void A05() {
        C18260x0.A0y("UserNoticeManager/updateUserNoticeStage/expected current stage: ", AnonymousClass001.A0o(), 2);
        C622234e A022 = this.A05.A02();
        C626936e.A06(A022);
        int i = A022.A00;
        if (2 < i) {
            C18260x0.A0y("UserNoticeManager/updateUserNoticeStage/already moved forward, stored current stage: ", AnonymousClass001.A0o(), i);
            return;
        }
        C53722nY A032 = this.A04.A03(A022);
        C626936e.A06(A032);
        int i2 = 3;
        if (A032.A04 == null) {
            i2 = 4;
            if (A032.A03 == null) {
                i2 = 5;
            }
        }
        A0A(A022, i2);
    }

    public void A02() {
        C622234e A022 = this.A05.A02();
        if (A022 == null) {
            Log.e("UserNoticeManager/agreeUserNotice/no current notice to agree");
            this.A00.A0A("UserNoticeManager/agreeUserNotice/noContent", true, (String) null);
            return;
        }
        Log.i("UserNoticeManager/agreeUserNotice");
        A0A(A022, 5);
    }

    public void A03() {
        Log.i("UserNoticeManager/deleteAllUserNoticesWithoutCleanup");
        C623034m r3 = this.A04;
        Log.i("UserNoticeContentManager/deleteAllUserNoticeData");
        File A022 = C623034m.A02(C54292oU.A03(r3.A02), "user_notice");
        if (A022 != null) {
            r3.A09.BkM(C71263bp.A00(A022, 32));
        }
        r3.A00 = null;
        C55772qt r2 = this.A05;
        C18270x1.A0g(C55772qt.A00(r2).remove("current_user_notice_banner_dismiss_timestamp"), "user_notices");
        r2.A02.clear();
    }

    public void A04() {
        C55772qt r1 = this.A05;
        C18270x1.A0i(r1.A01().edit(), "current_user_notice_banner_dismiss_timestamp", this.A01.A0H());
    }

    public final void A06() {
        Log.i("UserNoticeManager/cleanupAfterDelete");
        C72333dY.A01(this.A07).A0A("tag.whatsapp.usernotice.getStage()update");
        C623034m r1 = this.A04;
        Log.i("UserNoticeContentManager/cancelWork");
        C34171uL r2 = r1.A0A;
        C72333dY.A01(r2).A0A("tag.whatsapp.usernotice.content.fetch");
        C72333dY.A01(r2).A0A("tag.whatsapp.usernotice.icon.fetch");
    }

    public final void A08(C53722nY r11, C622234e r12) {
        String str;
        String str2;
        int i;
        AnonymousClass5RT r0;
        AnonymousClass5RT r02;
        AnonymousClass5RT r03;
        int i2 = r12.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UserNoticeManager/transitionUserNoticeStageIfNecessary/noticeId: ");
        A0o.append(r12.A01);
        C18260x0.A0y(" currentStage: ", A0o, i2);
        if (i2 == 0) {
            Log.i("UserNoticeManager/transitionUserNoticeStageIfNecessary/stage 0, no timing transition needed");
            A0A(r12, 1);
            return;
        }
        if (i2 == 5) {
            str2 = "UserNoticeManager/transitionUserNoticeStageIfNecessary/stage 5, no timing transition needed";
        } else if (r11 == null) {
            str2 = "UserNoticeManager/transitionUserNoticeStageIfNecessary/no content";
        } else {
            long A0H = this.A01.A0H();
            ArrayList A0s = AnonymousClass001.A0s();
            C61202zs A002 = A00(r11, i2);
            if (!(A002 == null || (r03 = A002.A01) == null)) {
                A0s.add(new AnonymousClass5SI(i2, r03.A00, 1));
            }
            int i3 = 2;
            if (i2 >= 2 || r11.A02 == null) {
                i3 = 3;
                if (i2 >= 3 || r11.A04 == null) {
                    i3 = 4;
                    if (i2 >= 4 || r11.A03 == null) {
                        i3 = 5;
                    }
                }
            }
            int i4 = i3;
            while (i3 < 5) {
                C61202zs A003 = A00(r11, i3);
                if (!(A003 == null || (r02 = A003.A02) == null)) {
                    A0s.add(new AnonymousClass5SI(i3, r02.A00, 0));
                }
                C61202zs A004 = A00(r11, i3);
                if (!(A004 == null || (r0 = A004.A01) == null)) {
                    A0s.add(new AnonymousClass5SI(i3, r0.A00, 1));
                }
                i3++;
            }
            Iterator it = A0s.iterator();
            AnonymousClass5SI r4 = null;
            while (it.hasNext()) {
                AnonymousClass5SI r6 = (AnonymousClass5SI) it.next();
                if (r6.A02 > A0H) {
                    break;
                }
                r4 = r6;
            }
            if (r4 != null) {
                if (r4.A01 == 0) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("UserNoticeManager/handleEligibleFutureStartEndTiming/passed start timing: ");
                    A0o2.append(r4.A02);
                    A0o2.append(" of stage:");
                    int i5 = r4.A00;
                    C18260x0.A1G(A0o2, i5);
                    A0A(r12, i5);
                } else {
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    A0o3.append("UserNoticeManager/handleEligibleFutureStartEndTiming/passed end timing: ");
                    A0o3.append(r4.A02);
                    A0o3.append(" of stage: ");
                    int i6 = r4.A00;
                    C18260x0.A1G(A0o3, i6);
                    if (i6 == 0) {
                        i = 1;
                    } else {
                        i = 2;
                        if (i6 >= 2 || r11.A02 == null) {
                            i = 3;
                            if (i6 >= 3 || r11.A04 == null) {
                                i = 4;
                                if (i6 >= 4 || r11.A03 == null) {
                                    i = 5;
                                }
                            }
                        }
                    }
                    A0A(r12, i);
                }
                str2 = "UserNoticeManager/transitionUserNoticeStageIfNecessary/handleEligibleFutureStartEndTiming";
            } else {
                C61202zs A005 = A00(r11, i2);
                StringBuilder A0o4 = AnonymousClass001.A0o();
                A0o4.append("UserNoticeManager/transitionUserNoticeStageIfNecessary/currentStage = ");
                A0o4.append(i2);
                C18260x0.A0y("  next stage: ", A0o4, i4);
                C61202zs A006 = A00(r11, i4);
                if (A006 != null && A006.A02 != null) {
                    str2 = "UserNoticeManager/handleNextStageStartTime/next stage start time exists";
                } else if (A005 == null) {
                    return;
                } else {
                    if (A005.A01 != null) {
                        str2 = "UserNoticeManager/handleCurrentStageEndTiming/current stage end time exists";
                    } else {
                        C104635Rt r62 = A005.A00;
                        if (r62 != null) {
                            Log.i("UserNoticeManager/handleCurrentStageDuration/current stage duration exists");
                            long j = r62.A00;
                            if (j != -1) {
                                long j2 = r12.A04;
                                Log.i("UserNoticeManager/handleCurrentStageStaticDuration/static duration exists");
                                if (A0H >= j2 + j) {
                                    str = "UserNoticeManager/handleCurrentStageStaticDuration/current stage static duration expired";
                                } else {
                                    return;
                                }
                            } else {
                                long[] jArr = r62.A01;
                                if (jArr != null) {
                                    Log.i("UserNoticeManager/handleCurrentStageRepeatDuration/repeat duration exists");
                                    if (C18280x3.A02(this.A05.A01(), "current_user_notice_duration_repeat_index") > jArr.length) {
                                        str = "UserNoticeManager/handleCurrentStageRepeatDuration/current stage repeat duration complete";
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                            Log.i(str);
                            A0A(r12, i4);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        Log.i(str2);
    }

    public final void A09(C61202zs r6, boolean z) {
        C104635Rt r0 = r6.A00;
        if (r0 == null || r0.A01 == null) {
            Log.i("UserNoticeManager/handleRepeatTimingIfNecessary/no repeat duration");
            return;
        }
        Log.i("UserNoticeManager/handleRepeatTimingIfNecessary/set repeat values");
        int i = 1;
        if (!z) {
            i = 1 + C18280x3.A02(this.A05.A01(), "current_user_notice_duration_repeat_index");
        }
        C55772qt r4 = this.A05;
        C18270x1.A0h(r4.A01().edit(), "current_user_notice_duration_repeat_index", i);
        C18270x1.A0i(r4.A01().edit(), "current_user_notice_duration_repeat_timestamp", this.A01.A0H());
    }

    public final void A0A(C622234e r9, int i) {
        int i2 = r9.A01;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UserNoticeManager/updateUserNoticeStage/updating to new stage: ");
        A0o.append(i);
        C18260x0.A0y(" noticeId: ", A0o, i2);
        long A0H = this.A01.A0H();
        int i3 = r9.A03;
        C622234e r1 = new C622234e(i2, i, i3, A0H, 0);
        C55772qt r0 = this.A05;
        r0.A04(r1);
        C18270x1.A0g(r0.A01().edit().remove("current_user_notice_duration_repeat_index").remove("current_user_notice_duration_repeat_timestamp"), "current_user_notice_duration_static_timestamp_start");
        A07(i2, i, i3);
    }

    public final boolean A0B(C61202zs r12) {
        String A0b;
        C104635Rt r8 = r12.A00;
        boolean z = true;
        if (r8 == null) {
            A0b = "UserNoticeManager/shouldShowStage/no duration";
        } else {
            long A0H = this.A01.A0H();
            long j = r8.A00;
            if (j != -1) {
                Log.i("UserNoticeManager/shouldShowStageForStaticDuration/has static duration");
                C55772qt r10 = this.A05;
                long j2 = r10.A01().getLong("current_user_notice_duration_static_timestamp_start", 0);
                if (j2 == 0) {
                    C18260x0.A12("UserNoticeManager/shouldShowStageForStaticDuration/static duration start: ", AnonymousClass001.A0o(), A0H);
                    C18270x1.A0o(r10.A01(), "current_user_notice_duration_static_timestamp_start", A0H);
                    j2 = A0H;
                }
                if (A0H >= j2 + j) {
                    Log.i("UserNoticeManager/shouldShowStageForStaticDuration/static duration expired");
                    return false;
                }
                Log.i("UserNoticeManager/shouldShowStageForStaticDuration/static duration valid");
                return true;
            }
            long[] jArr = r8.A01;
            if (jArr == null) {
                A0b = "UserNoticeManager/shouldShowStage/no repeat duration";
            } else {
                C55772qt r6 = this.A05;
                int i = r6.A01().getInt("current_user_notice_duration_repeat_index", 0);
                if (i == 0) {
                    A0b = "UserNoticeManager/shouldShowStage/allow first repeat";
                } else if (i > jArr.length) {
                    Log.i("UserNoticeManager/shouldShowStage/no more repeats");
                    return false;
                } else {
                    if (A0H - AnonymousClass0x2.A0B(r6.A01(), "current_user_notice_duration_repeat_timestamp") < jArr[i - 1]) {
                        z = false;
                    }
                    A0b = AnonymousClass000.A0b("UserNoticeManager/shouldShowStage/repeatTimeElapse: ", AnonymousClass001.A0o(), z);
                }
            }
        }
        Log.i(A0b);
        return z;
    }

    public AnonymousClass33X(C55682qk r1, C56612sH r2, C57162tC r3, AnonymousClass1VX r4, C623034m r5, C55772qt r6, C51072jE r7, C34171uL r8) {
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A07 = r8;
        this.A06 = r7;
        this.A04 = r5;
        this.A05 = r6;
        this.A02 = r3;
    }

    public final void A07(int i, int i2, int i3) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UserNoticeManager/enqueueStageUpdateWork/notice id: ");
        A0o.append(i);
        A0o.append(" stage: ");
        A0o.append(i2);
        C18260x0.A0y(" version: ", A0o, i3);
        AnonymousClass0Q9 r1 = new AnonymousClass0Q9();
        r1.A01("notice_id", i);
        r1.A01("stage", i2);
        r1.A01("version", i3);
        C01460Ay A0P = C18290x4.A0P(C18270x1.A07(), r1.A00(), new AnonymousClass0Aw(UserNoticeStageUpdateWorker.class), "tag.whatsapp.usernotice.getStage()update");
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("tag.whatsapp.usernotice.getStage()update.");
        A0o2.append(i);
        C72333dY.A07(A0P, this.A07, AnonymousClass000.A0Y(".", A0o2, i2));
    }
}
