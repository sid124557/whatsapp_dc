package X;

/* renamed from: X.3Zv  reason: invalid class name and case insensitive filesystem */
public class C70083Zv implements Runnable {
    public long A00;
    public Object A01;
    public final int A02;

    public C70083Zv(Object obj, long j, int i) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0060, code lost:
        r1 = X.C61102zi.A03(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0068, code lost:
        if (r1.hasNext() == false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006a, code lost:
        ((X.C84904Ee) r1.next()).Avq(r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0148, code lost:
        r1.A0G(java.lang.Long.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x014f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x019e, code lost:
        r5.A0S(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01a1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0225, code lost:
        X.C18270x1.A0h(X.C18270x1.A03(r5), "business_activity_report_state", 1);
        X.C18260x0.A0M(r5, "business_activity_report_timestamp", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0234, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r13 = this;
            int r0 = r13.A02
            switch(r0) {
                case 0: goto L_0x035a;
                case 1: goto L_0x0150;
                case 2: goto L_0x034e;
                case 3: goto L_0x029a;
                case 4: goto L_0x0130;
                case 5: goto L_0x0117;
                case 6: goto L_0x00fe;
                case 7: goto L_0x00bd;
                case 8: goto L_0x00a5;
                case 9: goto L_0x0281;
                case 10: goto L_0x0074;
                case 11: goto L_0x0271;
                case 12: goto L_0x025c;
                case 13: goto L_0x0252;
                case 14: goto L_0x0248;
                case 15: goto L_0x016c;
                case 16: goto L_0x0022;
                case 17: goto L_0x0235;
                case 18: goto L_0x0219;
                case 19: goto L_0x0200;
                case 20: goto L_0x0057;
                case 21: goto L_0x01b0;
                case 22: goto L_0x004d;
                case 23: goto L_0x01a2;
                case 24: goto L_0x0039;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r13.A01
            X.5TM r2 = (X.AnonymousClass5TM) r2
            long r0 = r13.A00
            r2.A00 = r0
            X.7Ei r3 = r2.A05
            if (r3 == 0) goto L_0x0021
            int r2 = r2.A09
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CompositeHeroPlayer - onVideoStartedPlaying() - "
            X.C18260x0.A0w(r0, r1, r2)
            X.5Xn r0 = r3.A00
            r0.A01()
        L_0x0021:
            return
        L_0x0022:
            java.lang.Object r3 = r13.A01
            com.whatsapp.mediaview.MediaViewFragment r3 = (com.whatsapp.mediaview.MediaViewFragment) r3
            long r1 = r13.A00
            X.2qz r0 = r3.A1d
            X.34x r1 = X.C55122pp.A00(r0, r1)
            X.3Wi r5 = r3.A0L
            r0 = 43
            X.3by r2 = new X.3by
            r2.<init>(r3, r0, r1)
            goto L_0x019e
        L_0x0039:
            java.lang.Object r0 = r13.A01
            X.4Me r0 = (X.C86874Me) r0
            long r1 = r13.A00
            java.lang.ref.WeakReference r0 = r0.A0D
            java.lang.Object r0 = r0.get()
            X.5pp r0 = (X.C116155pp) r0
            if (r0 == 0) goto L_0x0021
            r0.A03(r1)
            return
        L_0x004d:
            java.lang.Object r0 = r13.A01
            X.30F r0 = (X.AnonymousClass30F) r0
            long r2 = r13.A00
            X.1iZ r0 = r0.A0A
            r4 = 2
            goto L_0x0060
        L_0x0057:
            java.lang.Object r0 = r13.A01
            com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver r0 = (com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver) r0
            long r2 = r13.A00
            X.1iZ r0 = r0.A0C
            r4 = 1
        L_0x0060:
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x0064:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r1.next()
            X.4Ee r0 = (X.C84904Ee) r0
            r0.Avq(r2, r4)
            goto L_0x0064
        L_0x0074:
            java.lang.Object r7 = r13.A01
            X.4VQ r7 = (X.AnonymousClass4VQ) r7
            long r3 = r13.A00
            X.34x r6 = r7.A0G()
            X.4UC r5 = r7.A1B
            java.lang.Object r0 = r5.A07()
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            if (r0 == 0) goto L_0x0021
            X.2z0 r0 = r6.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0021
            X.2sH r0 = r7.A0i
            long r1 = X.C56612sH.A04(r0, r6)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0385
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r5.A0H(r0)
            java.lang.String r0 = "MessagesViewModel/Bot typing indicator timed out"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return
        L_0x00a5:
            java.lang.Object r3 = r13.A01
            X.5l7 r3 = (X.C113245l7) r3
            long r1 = r13.A00
            X.2qz r0 = r3.A5I
            X.34x r1 = X.C55122pp.A00(r0, r1)
            if (r1 == 0) goto L_0x0021
            X.3Wi r5 = r3.A1Z
            r0 = 0
            X.5rT r2 = new X.5rT
            r2.<init>(r3, r0, r1)
            goto L_0x019e
        L_0x00bd:
            java.lang.Object r1 = r13.A01
            X.3TC r1 = (X.AnonymousClass3TC) r1
            long r10 = r13.A00
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0021
            X.2Vm r6 = r1.A07
            X.239 r7 = r1.A01
            X.2S3 r8 = r1.A00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CompanionDeviceQrHandler/onRetry retryTs="
            X.C18260x0.A12(r0, r1, r10)
            X.2qg r5 = r6.A00
            X.C55642qg.A00(r5)
            X.2r3 r0 = r5.A04
            X.2sH r0 = r0.A01
            long r0 = r0.A0F()
            long r0 = X.C18290x4.A0B(r0)
            r3 = 86400(0x15180, double:4.26873E-319)
            long r3 = r3 + r0
            int r2 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0389
            r5.A02()
            X.4FS r0 = r5.A0I
            r9 = 3
            X.3cE r5 = new X.3cE
            r5.<init>(r6, r7, r8, r9, r10)
            r0.BkM(r5)
            return
        L_0x00fe:
            java.lang.Object r2 = r13.A01
            X.1u3 r2 = (X.C33991u3) r2
            long r3 = r13.A00
            java.lang.ref.WeakReference r0 = r2.A0B
            java.lang.Object r1 = r0.get()
            X.10p r1 = (X.AnonymousClass10p) r1
            if (r1 == 0) goto L_0x0021
            boolean r0 = X.C18320x8.A1T(r2)
            if (r0 != 0) goto L_0x0021
            X.08M r1 = r1.A0A
            goto L_0x0148
        L_0x0117:
            java.lang.Object r2 = r13.A01
            X.1u3 r2 = (X.C33991u3) r2
            long r3 = r13.A00
            java.lang.ref.WeakReference r0 = r2.A0B
            java.lang.Object r1 = r0.get()
            X.10p r1 = (X.AnonymousClass10p) r1
            if (r1 == 0) goto L_0x0021
            boolean r0 = X.C18320x8.A1T(r2)
            if (r0 != 0) goto L_0x0021
            X.08M r1 = r1.A0D
            goto L_0x0148
        L_0x0130:
            java.lang.Object r2 = r13.A01
            X.1u3 r2 = (X.C33991u3) r2
            long r3 = r13.A00
            java.lang.ref.WeakReference r0 = r2.A0B
            java.lang.Object r1 = r0.get()
            X.10p r1 = (X.AnonymousClass10p) r1
            if (r1 == 0) goto L_0x0021
            boolean r0 = X.C18320x8.A1T(r2)
            if (r0 != 0) goto L_0x0021
            X.08M r1 = r1.A0E
        L_0x0148:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r1.A0G(r0)
            return
        L_0x0150:
            java.lang.Object r0 = r13.A01
            X.85C r0 = (X.AnonymousClass85C) r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A01
            java.util.Iterator r3 = r0.iterator()
        L_0x015a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0021
            java.lang.Object r2 = r3.next()
            X.8vW r2 = (X.C186538vW) r2
            long r0 = r13.A00
            r2.Bb5(r0)
            goto L_0x015a
        L_0x016c:
            java.lang.Object r4 = r13.A01
            com.whatsapp.inappsupportbloks.components.BloksSupportVideoView r4 = (com.whatsapp.inappsupportbloks.components.BloksSupportVideoView) r4
            long r2 = r13.A00
            java.lang.String r1 = r4.A0D
            if (r1 != 0) goto L_0x017e
            java.lang.String r0 = "videoUrl"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x017e:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r8 = r0.toMicros(r2)
            r6 = -1
            r7 = 0
            X.8HP r5 = new X.8HP
            r5.<init>(r1)
            r11 = 1
            r10 = r7
            android.graphics.Bitmap r1 = X.C107085af.A00(r5, r6, r7, r8, r10, r11)
            if (r1 == 0) goto L_0x0021
            X.3Wi r5 = r4.getGlobalUI()
            r0 = 47
            X.3Zx r2 = new X.3Zx
            r2.<init>(r4, r0, r1)
        L_0x019e:
            r5.A0S(r2)
            return
        L_0x01a2:
            java.lang.Object r2 = r13.A01
            X.7TB r2 = (X.AnonymousClass7TB) r2
            long r0 = r13.A00
            monitor-enter(r2)
            r2.A00 = r0     // Catch:{ all -> 0x01ad }
            monitor-exit(r2)
            return
        L_0x01ad:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x01b0:
            java.lang.Object r5 = r13.A01
            com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver r5 = (com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver) r5
            long r0 = r13.A00
            X.2qK r2 = r5.A09
            X.3dV r2 = r2.A05
            X.4Fq r6 = r2.A04()
            r4 = 1
            android.content.ContentValues r8 = X.AnonymousClass0x9.A07(r4)     // Catch:{ all -> 0x01f6 }
            java.lang.String r3 = "is_upcoming"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01f6 }
            r8.put(r3, r2)     // Catch:{ all -> 0x01f6 }
            r2 = r6
            X.3H0 r2 = (X.AnonymousClass3H0) r2     // Catch:{ all -> 0x01f6 }
            X.2sg r7 = r2.A03     // Catch:{ all -> 0x01f6 }
            java.lang.String r9 = "scheduled_calls"
            java.lang.String r10 = "creation_message_row_id = ?"
            java.lang.String[] r12 = new java.lang.String[r4]     // Catch:{ all -> 0x01f6 }
            X.C18260x0.A1X(r12, r0)     // Catch:{ all -> 0x01f6 }
            java.lang.String r11 = "ScheduledCallsStore/UPDATE_IS_UPCOMING_SCHEDULED_CALL_BY_ROW_ID"
            int r2 = r7.A05(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x01f6 }
            if (r2 != 0) goto L_0x01e6
            java.lang.String r2 = "ScheduledCallsStore/updateScheduledCallIsUpcomingToFalse (by row ID) failed to update"
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x01f6 }
        L_0x01e6:
            r6.close()
            X.3Wi r4 = r5.A01
            r3 = 20
            X.3Zv r2 = new X.3Zv
            r2.<init>(r5, r0, r3)
            r4.A0S(r2)
            return
        L_0x01f6:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x01fb }
            throw r1
        L_0x01fb:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0200:
            java.lang.Object r0 = r13.A01
            X.3T7 r0 = (X.AnonymousClass3T7) r0
            long r2 = r13.A00
            X.5Gi r0 = r0.A00
            com.whatsapp.report.BusinessActivityReportViewModel r4 = r0.A00
            X.08M r1 = r4.A01
            r0 = 0
            X.C06270Wx.A03(r1, r0)
            X.08M r1 = r4.A02
            r0 = 1
            X.C06270Wx.A03(r1, r0)
            X.33p r5 = r4.A04
            goto L_0x0225
        L_0x0219:
            java.lang.Object r0 = r13.A01
            X.3T6 r0 = (X.AnonymousClass3T6) r0
            long r2 = r13.A00
            X.5Gj r0 = r0.A00
            com.whatsapp.report.BusinessActivityReportViewModel r0 = r0.A00
            X.33p r5 = r0.A04
        L_0x0225:
            r4 = 1
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r5)
            java.lang.String r0 = "business_activity_report_state"
            X.C18270x1.A0h(r1, r0, r4)
            java.lang.String r0 = "business_activity_report_timestamp"
            X.C18260x0.A0M(r5, r0, r2)
            return
        L_0x0235:
            java.lang.Object r5 = r13.A01
            com.whatsapp.migration.export.ui.ExportMigrationActivity r5 = (com.whatsapp.migration.export.ui.ExportMigrationActivity) r5
            long r3 = r13.A00
            X.2j6 r2 = r5.A0G
            java.lang.String r1 = r5.A0J
            r0 = 9
            r2.A00(r1, r0)
            r5.A75(r3)
            return
        L_0x0248:
            java.lang.Object r2 = r13.A01
            com.whatsapp.inappsupportbloks.components.BloksSupportVideoView r2 = (com.whatsapp.inappsupportbloks.components.BloksSupportVideoView) r2
            long r0 = r13.A00
            com.whatsapp.inappsupportbloks.components.BloksSupportVideoView.A00(r2, r0)
            return
        L_0x0252:
            java.lang.Object r2 = r13.A01
            X.3Er r2 = (X.C64723Er) r2
            long r0 = r13.A00
            r2.A00(r0)
            return
        L_0x025c:
            java.lang.Object r0 = r13.A01
            X.2ge r0 = (X.C49512ge) r0
            long r2 = r13.A00
            X.0Qw r1 = r0.A00
            monitor-enter(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x026e }
            r1.A05(r0)     // Catch:{ all -> 0x026e }
            monitor-exit(r1)     // Catch:{ all -> 0x026e }
            return
        L_0x026e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x026e }
            throw r0
        L_0x0271:
            java.lang.Object r0 = r13.A01
            X.2sJ r0 = (X.C56632sJ) r0
            long r2 = r13.A00
            X.0Qw r1 = r0.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A05(r0)
            return
        L_0x0281:
            java.lang.Object r0 = r13.A01
            X.4VQ r0 = (X.AnonymousClass4VQ) r0
            long r3 = r13.A00
            X.2rc r1 = r0.A0y
            X.4uZ r2 = r0.A0x
            X.4uY r2 = (X.C95804uY) r2
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            r5 = 9223372036854675806(0x7ffffffffffe795e, double:NaN)
            r1.A03(r2, r3, r5)
            return
        L_0x029a:
            java.lang.Object r5 = r13.A01
            com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner r5 = (com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner) r5
            long r2 = r13.A00
            boolean r0 = r5.isAttachedToWindow()
            if (r0 != 0) goto L_0x02ac
            java.lang.String r0 = "VoipInCallNotifBanner/animateIn view is not attached yet"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x02ac:
            r6 = 0
            r5.setVisibility(r6)
            int r0 = r5.A01
            if (r0 == 0) goto L_0x02b8
            int r0 = r5.A00
            if (r0 != 0) goto L_0x02ec
        L_0x02b8:
            android.view.ViewParent r0 = r5.getParent()
            android.view.View r0 = (android.view.View) r0
            int r4 = r0.getWidth()
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131166716(0x7f0705fc, float:1.7947685E38)
            float r0 = r1.getDimension(r0)
            int r0 = (int) r0
            int r0 = r0 * 2
            int r4 = r4 - r0
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r6)
            r5.measure(r1, r0)
            int r0 = r5.getMeasuredWidth()
            int r0 = r0 / 2
            r5.A00 = r0
            int r0 = r5.getMeasuredHeight()
            r5.A01 = r0
        L_0x02ec:
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            r0 = 600(0x258, double:2.964E-321)
            r4.setDuration(r0)
            X.4L5 r0 = new X.4L5
            r0.<init>(r5, r2)
            r4.addListener(r0)
            r1 = 1073741824(0x40000000, float:2.0)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>(r1)
            r4.setInterpolator(r0)
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            int r9 = r5.A00
            int r8 = r5.A01
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131165583(0x7f07018f, float:1.7945387E38)
            float r7 = r1.getDimension(r0)
            int r0 = r5.A00
            float r2 = (float) r0
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131165582(0x7f07018e, float:1.7945385E38)
            float r0 = r1.getDimension(r0)
            float r2 = r2 + r0
            android.animation.Animator r0 = android.view.ViewAnimationUtils.createCircularReveal(r5, r9, r8, r7, r2)
            r3.add(r0)
            r0 = 2
            float[] r2 = new float[r0]
            int r0 = r5.A02
            float r0 = (float) r0
            r2[r6] = r0
            r1 = 1
            r0 = 0
            r2[r1] = r0
            java.lang.String r0 = "translationY"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r5, r0, r2)
            r3.add(r0)
            r4.playTogether(r3)
            r4.start()
            return
        L_0x034e:
            java.lang.Object r0 = r13.A01
            X.7VZ r0 = (X.AnonymousClass7VZ) r0
            long r1 = r13.A00
            X.8uy r0 = r0.A01
            r0.BMs(r1)
            return
        L_0x035a:
            java.lang.Object r6 = r13.A01
            X.7iG r6 = (X.C157417iG) r6
            java.lang.Object r5 = r6.A01
            monitor-enter(r5)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0382 }
            r0 = 23
            if (r1 < r0) goto L_0x036d
            r0 = 100
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x037a }
            goto L_0x037d
        L_0x036d:
            java.io.File r0 = X.C157417iG.A03     // Catch:{ all -> 0x0382 }
            long r3 = r0.lastModified()     // Catch:{ all -> 0x0382 }
            long r1 = r13.A00     // Catch:{ all -> 0x0382 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x037d
            goto L_0x036d
        L_0x037a:
            X.C18300x5.A11()     // Catch:{ all -> 0x0382 }
        L_0x037d:
            r6.A00()     // Catch:{ all -> 0x0382 }
            monitor-exit(r5)     // Catch:{ all -> 0x0382 }
            return
        L_0x0382:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0382 }
            throw r0
        L_0x0385:
            r7.A0T(r6)
            return
        L_0x0389:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "CompanionDeviceAdvUtil/isRetryTimestampValid retryTs="
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = "; ntpTs="
            X.C18260x0.A11(r2, r3, r0)
            java.lang.String r0 = "CompanionDeviceQrHandler/onRetry invalid local ts"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.4FK r0 = r5.A0G
            r0.BUi()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70083Zv.run():void");
    }
}
