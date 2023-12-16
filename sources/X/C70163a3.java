package X;

/* renamed from: X.3a3  reason: invalid class name and case insensitive filesystem */
public class C70163a3 implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public C70163a3(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0279, code lost:
        X.AnonymousClass36X.A05(r3, r1, r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x027c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.A02
            switch(r0) {
                case 0: goto L_0x00a4;
                case 1: goto L_0x019f;
                case 2: goto L_0x01c1;
                case 3: goto L_0x01fa;
                case 4: goto L_0x0221;
                case 5: goto L_0x0259;
                case 6: goto L_0x027d;
                case 7: goto L_0x028c;
                case 8: goto L_0x02a8;
                case 9: goto L_0x02c4;
                case 10: goto L_0x02c4;
                case 11: goto L_0x02d2;
                case 12: goto L_0x0319;
                case 13: goto L_0x034d;
                case 14: goto L_0x0359;
                case 15: goto L_0x0367;
                case 16: goto L_0x0406;
                case 17: goto L_0x0427;
                case 18: goto L_0x0371;
                case 19: goto L_0x03fa;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r11.A01     // Catch:{ IOException -> 0x0096 }
            org.whispersystems.jobqueue.Job r4 = (org.whispersystems.jobqueue.Job) r4     // Catch:{ IOException -> 0x0096 }
            org.whispersystems.jobqueue.JobParameters r0 = r4.parameters     // Catch:{ IOException -> 0x0096 }
            boolean r0 = r0.isPersistent     // Catch:{ IOException -> 0x0096 }
            if (r0 == 0) goto L_0x0060
            java.lang.Object r0 = r11.A00     // Catch:{ IOException -> 0x0096 }
            X.2d0 r0 = (X.C47282d0) r0     // Catch:{ IOException -> 0x0096 }
            X.2xK r5 = r0.A08     // Catch:{ IOException -> 0x0096 }
            android.content.ContentValues r6 = X.AnonymousClass0x9.A06()     // Catch:{ IOException -> 0x0096 }
            java.io.ByteArrayOutputStream r1 = X.AnonymousClass0x9.A0e()     // Catch:{ NotSerializableException -> 0x0085 }
            java.io.ObjectOutputStream r0 = new java.io.ObjectOutputStream     // Catch:{ NotSerializableException -> 0x0085 }
            r0.<init>(r1)     // Catch:{ NotSerializableException -> 0x0085 }
            r0.writeObject(r4)     // Catch:{ NotSerializableException -> 0x0085 }
            byte[] r0 = r1.toByteArray()     // Catch:{ NotSerializableException -> 0x0085 }
            java.lang.String r1 = X.AnonymousClass76H.A00(r0)     // Catch:{ NotSerializableException -> 0x0085 }
            java.lang.String r0 = "item"
            r6.put(r0, r1)     // Catch:{ IOException -> 0x0096 }
            java.lang.Boolean r1 = X.C18320x8.A0U()     // Catch:{ IOException -> 0x0096 }
            java.lang.String r0 = "encrypted"
            r6.put(r0, r1)     // Catch:{ IOException -> 0x0096 }
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r5.A03     // Catch:{ all -> 0x0056 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.readLock()     // Catch:{ all -> 0x0056 }
            r0.lock()     // Catch:{ all -> 0x0056 }
            X.6Cp r0 = r5.A05     // Catch:{ all -> 0x0056 }
            android.database.sqlite.SQLiteDatabase r2 = r0.getWritableDatabase()     // Catch:{ all -> 0x0056 }
            java.lang.String r1 = "queue"
            r0 = 0
            long r0 = r2.insert(r1, r0, r6)     // Catch:{ all -> 0x0056 }
            r4.A02(r0)     // Catch:{ all -> 0x0056 }
            goto L_0x005d
        L_0x0056:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.A03     // Catch:{ IOException -> 0x0096 }
            X.C18310x6.A1S(r0)     // Catch:{ IOException -> 0x0096 }
            goto L_0x0095
        L_0x005d:
            X.C18310x6.A1S(r3)     // Catch:{ IOException -> 0x0096 }
        L_0x0060:
            java.lang.Object r2 = r11.A00     // Catch:{ IOException -> 0x0096 }
            X.2d0 r2 = (X.C47282d0) r2     // Catch:{ IOException -> 0x0096 }
            X.5Lr r1 = r2.A07     // Catch:{ IOException -> 0x0096 }
            android.content.Context r0 = r2.A01     // Catch:{ IOException -> 0x0096 }
            r1.A00(r0, r4)     // Catch:{ IOException -> 0x0096 }
            r4.A04()     // Catch:{ IOException -> 0x0096 }
            X.2nb r1 = r2.A06     // Catch:{ IOException -> 0x0096 }
            monitor-enter(r1)     // Catch:{ IOException -> 0x0096 }
            java.util.LinkedList r0 = r1.A01     // Catch:{ all -> 0x0082 }
            r0.add(r4)     // Catch:{ all -> 0x0082 }
            r1.A01(r4)     // Catch:{ all -> 0x0082 }
            X.3f6 r0 = r1.A05     // Catch:{ all -> 0x0082 }
            android.os.ConditionVariable r0 = r0.A00     // Catch:{ all -> 0x0082 }
            r0.open()     // Catch:{ all -> 0x0082 }
            monitor-exit(r1)     // Catch:{ IOException -> 0x0096 }
            return
        L_0x0082:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x0096 }
            goto L_0x0095
        L_0x0085:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0096 }
            java.lang.String r0 = "Can't serialize job:"
            java.lang.String r0 = X.AnonymousClass000.A0P(r4, r0, r1)     // Catch:{ IOException -> 0x0096 }
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ IOException -> 0x0096 }
            r2.<init>(r0, r3)     // Catch:{ IOException -> 0x0096 }
        L_0x0095:
            throw r2     // Catch:{ IOException -> 0x0096 }
        L_0x0096:
            r1 = move-exception
            java.lang.String r0 = "JobManager"
            android.util.Log.w(r0, r1)
            java.lang.Object r0 = r11.A01
            org.whispersystems.jobqueue.Job r0 = (org.whispersystems.jobqueue.Job) r0
            r0.A05()
            return
        L_0x00a4:
            java.lang.Object r3 = r11.A00
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity r3 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity) r3
            java.lang.Object r4 = r11.A01
            X.2fU r4 = (X.C48792fU) r4
            java.lang.String r0 = "AccountLinkingWebAuthActivity/onCreate Launching web auth url"
            X.C106245Ye.A00(r0)
            X.5hb r1 = r3.A05
            if (r1 == 0) goto L_0x0197
            java.lang.String r0 = "SEE_WEB_AUTH"
            r1.A05(r0)
            X.2XF r6 = r3.A02     // Catch:{ 57M -> 0x0344 }
            if (r6 == 0) goto L_0x018a
            X.3Z6 r0 = r3.A07     // Catch:{ 57M -> 0x0344 }
            if (r0 == 0) goto L_0x0192
            java.lang.Object r5 = r0.second     // Catch:{ 57M -> 0x0344 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ 57M -> 0x0344 }
            r2 = 1
            X.C162457s7.A0J(r5, r2)     // Catch:{ 57M -> 0x0344 }
            android.net.Uri r0 = r6.A00(r5)     // Catch:{ 57M -> 0x0344 }
            X.C162457s7.A0D(r0)     // Catch:{ 57M -> 0x0344 }
            java.lang.String r8 = "android.intent.action.VIEW"
            android.content.Intent r7 = new android.content.Intent     // Catch:{ 57M -> 0x0344 }
            r7.<init>(r8, r0)     // Catch:{ 57M -> 0x0344 }
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch:{ 57M -> 0x0344 }
            r0 = 131072(0x20000, float:1.83671E-40)
            java.util.List r1 = r1.queryIntentActivities(r7, r0)     // Catch:{ 57M -> 0x0344 }
            X.C162457s7.A0D(r1)     // Catch:{ 57M -> 0x0344 }
            boolean r0 = r1.isEmpty()     // Catch:{ 57M -> 0x0344 }
            if (r0 == 0) goto L_0x0153
            X.3d3 r7 = X.C72023d3.A00     // Catch:{ 57M -> 0x0344 }
        L_0x00ed:
            boolean r0 = r7.isEmpty()     // Catch:{ 57M -> 0x0344 }
            if (r0 != 0) goto L_0x0182
            java.lang.String r7 = X.AnonymousClass0H1.A00(r3, r7, r2)     // Catch:{ 57M -> 0x0344 }
            if (r7 == 0) goto L_0x016f
            android.content.res.Resources r1 = r3.getResources()     // Catch:{ 57M -> 0x0344 }
            r0 = 2131100463(0x7f06032f, float:1.7813308E38)
            int r1 = r1.getColor(r0)     // Catch:{ 57M -> 0x0344 }
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 | r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ 57M -> 0x0344 }
            X.0KF r10 = new X.0KF     // Catch:{ 57M -> 0x0344 }
            r10.<init>(r0)     // Catch:{ 57M -> 0x0344 }
            X.0OV r8 = new X.0OV     // Catch:{ 57M -> 0x0344 }
            r8.<init>()     // Catch:{ 57M -> 0x0344 }
            r0 = 2
            r8.A00 = r0     // Catch:{ 57M -> 0x0344 }
            java.lang.String r9 = "android.support.customtabs.extra.SHARE_MENU_ITEM"
            android.content.Intent r1 = r8.A02     // Catch:{ 57M -> 0x0344 }
            r0 = 0
            r1.putExtra(r9, r0)     // Catch:{ 57M -> 0x0344 }
            java.lang.String r0 = "android.support.customtabs.extra.TITLE_VISIBILITY"
            r1.putExtra(r0, r2)     // Catch:{ 57M -> 0x0344 }
            java.lang.String r0 = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING"
            r1.putExtra(r0, r2)     // Catch:{ 57M -> 0x0344 }
            android.os.Bundle r2 = X.AnonymousClass002.A08()     // Catch:{ 57M -> 0x0344 }
            java.lang.Integer r0 = r10.A00     // Catch:{ 57M -> 0x0344 }
            if (r0 == 0) goto L_0x013b
            java.lang.String r1 = "android.support.customtabs.extra.TOOLBAR_COLOR"
            int r0 = r0.intValue()     // Catch:{ 57M -> 0x0344 }
            r2.putInt(r1, r0)     // Catch:{ 57M -> 0x0344 }
        L_0x013b:
            r8.A01 = r2     // Catch:{ 57M -> 0x0344 }
            X.0KG r0 = r8.A00()     // Catch:{ 57M -> 0x0344 }
            android.content.Intent r1 = r0.A00     // Catch:{ 57M -> 0x0344 }
            r1.setPackage(r7)     // Catch:{ 57M -> 0x0344 }
            android.net.Uri r0 = r6.A00(r5)     // Catch:{ 57M -> 0x0344 }
            r1.setData(r0)     // Catch:{ 57M -> 0x0344 }
            r0 = 0
            X.AnonymousClass0RN.A00(r3, r1, r0)     // Catch:{ 57M -> 0x0344 }
            goto L_0x0349
        L_0x0153:
            java.util.ArrayList r7 = X.C73783g4.A0c(r1)     // Catch:{ 57M -> 0x0344 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ 57M -> 0x0344 }
        L_0x015b:
            boolean r0 = r1.hasNext()     // Catch:{ 57M -> 0x0344 }
            if (r0 == 0) goto L_0x00ed
            java.lang.Object r0 = r1.next()     // Catch:{ 57M -> 0x0344 }
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0     // Catch:{ 57M -> 0x0344 }
            android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch:{ 57M -> 0x0344 }
            java.lang.String r0 = r0.packageName     // Catch:{ 57M -> 0x0344 }
            r7.add(r0)     // Catch:{ 57M -> 0x0344 }
            goto L_0x015b
        L_0x016f:
            android.net.Uri r0 = r6.A00(r5)     // Catch:{ 57M -> 0x0344 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ 57M -> 0x0344 }
            r1.<init>(r8, r0)     // Catch:{ 57M -> 0x0344 }
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r1.addFlags(r0)     // Catch:{ 57M -> 0x0344 }
            r3.startActivity(r1)     // Catch:{ 57M -> 0x0344 }
            goto L_0x0349
        L_0x0182:
            r1 = 3
            r0 = 0
            X.57M r2 = new X.57M     // Catch:{ 57M -> 0x0344 }
            r2.<init>(r0, r0, r0, r1)     // Catch:{ 57M -> 0x0344 }
            goto L_0x0196
        L_0x018a:
            java.lang.String r0 = "webAuthBrowserLauncher"
            java.lang.RuntimeException r2 = X.C18270x1.A0S(r0)     // Catch:{ 57M -> 0x0344 }
            goto L_0x0196
        L_0x0192:
            java.lang.IllegalStateException r2 = X.C18290x4.A0Y()     // Catch:{ 57M -> 0x0344 }
        L_0x0196:
            throw r2     // Catch:{ 57M -> 0x0344 }
        L_0x0197:
            java.lang.String r0 = "xFamilyUserFlowLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x019f:
            java.lang.Object r0 = r11.A00
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r2 = r11.A01
            X.5YA r2 = (X.AnonymousClass5YA) r2
            java.util.ArrayList r4 = X.C73783g4.A0c(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x01af:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01b9
            X.C624134x.A0Z(r4, r1)
            goto L_0x01af
        L_0x01b9:
            X.3Wi r3 = r2.A01
            X.1iN r1 = r2.A05
            X.8qC r0 = r2.A0D
            goto L_0x0279
        L_0x01c1:
            java.lang.Object r5 = r11.A00
            X.3Gk r5 = (X.C65153Gk) r5
            java.lang.Object r4 = r11.A01
            X.34x r4 = (X.C624134x) r4
            r3 = 1
            X.8qC r0 = r5.A05
            java.lang.Object r0 = r0.get()
            X.2oy r0 = (X.C54592oy) r0
            long r1 = r4.A1L
            r0.A01()
            X.0i7 r7 = r0.A00
            monitor-enter(r7)
            r0 = 0
            java.lang.Object r0 = r7.A05(r1, r0)     // Catch:{ all -> 0x03f2 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x03f2 }
            monitor-exit(r7)
            if (r0 == 0) goto L_0x034c
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x034c
            X.8qC r0 = r5.A04
            java.lang.Object r1 = r0.get()
            X.2r9 r1 = (X.C55932r9) r1
            java.util.List r0 = X.C18290x4.A12(r4)
            r1.A04(r0, r3)
            return
        L_0x01fa:
            java.lang.Object r4 = r11.A00
            X.3Gk r4 = (X.C65153Gk) r4
            java.lang.Object r3 = r11.A01
            r2 = 0
            X.8qC r0 = r4.A03
            java.lang.Object r1 = r0.get()
            X.2rK r1 = (X.C56042rK) r1
            X.21S r0 = X.AnonymousClass21S.A0D
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x034c
            X.8qC r0 = r4.A04
            java.lang.Object r1 = r0.get()
            X.2r9 r1 = (X.C55932r9) r1
            java.util.List r0 = X.C18290x4.A12(r3)
            r1.A04(r0, r2)
            return
        L_0x0221:
            java.lang.Object r4 = r11.A00
            X.34x r4 = (X.C624134x) r4
            java.lang.Object r3 = r11.A01
            X.3Gk r3 = (X.C65153Gk) r3
            boolean r0 = r4 instanceof X.C30481mW
            if (r0 != 0) goto L_0x0239
            X.8qC r0 = r3.A04
            java.lang.Object r0 = r0.get()
            X.2r9 r0 = (X.C55932r9) r0
            r0.A01(r4)
            return
        L_0x0239:
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x034c
            X.5Se r0 = r3.A02
            X.1VX r2 = r0.A01
            r1 = 4437(0x1155, float:6.218E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x034c
            X.8qC r0 = r3.A04
            java.lang.Object r0 = r0.get()
            X.2r9 r0 = (X.C55932r9) r0
            X.1mW r4 = (X.C30481mW) r4
            r0.A02(r4)
            return
        L_0x0259:
            java.lang.Object r0 = r11.A00
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r2 = r11.A01
            X.5Xa r2 = (X.C105945Xa) r2
            java.util.ArrayList r4 = X.C73783g4.A0c(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0269:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0273
            X.C624134x.A0Z(r4, r1)
            goto L_0x0269
        L_0x0273:
            X.3Wi r3 = r2.A01
            X.1iN r1 = r2.A05
            X.8qC r0 = r2.A08
        L_0x0279:
            X.AnonymousClass36X.A05(r3, r1, r0, r4)
            return
        L_0x027d:
            java.lang.Object r0 = r11.A00
            X.2Tq r0 = (X.C43832Tq) r0
            java.lang.Object r2 = r11.A01
            X.3QO r2 = (X.AnonymousClass3QO) r2
            X.33c r1 = r0.A04
            r0 = 0
            r1.A0E(r2, r0)
            return
        L_0x028c:
            java.lang.Object r0 = r11.A00
            X.2zi r0 = (X.C61102zi) r0
            java.lang.Object r2 = r11.A01
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x0298:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x034c
            java.lang.Object r0 = r1.next()
            X.65s r0 = (X.C1227865s) r0
            r0.BcN(r2)
            goto L_0x0298
        L_0x02a8:
            java.lang.Object r0 = r11.A00
            X.2zi r0 = (X.C61102zi) r0
            java.lang.Object r2 = r11.A01
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x02b4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x034c
            java.lang.Object r0 = r1.next()
            X.65s r0 = (X.C1227865s) r0
            r0.BcN(r2)
            goto L_0x02b4
        L_0x02c4:
            java.lang.Object r2 = r11.A00
            X.4GW r2 = (X.AnonymousClass4GW) r2
            java.lang.Object r1 = r11.A01
            X.3gB r1 = (X.C73853gB) r1
            X.2wD r0 = X.C59022wD.A00
            r2.BkC(r0, r1)
            return
        L_0x02d2:
            java.lang.Object r3 = r11.A01
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3
            boolean r0 = r3.isCancelled()
            if (r0 == 0) goto L_0x02e5
            java.lang.Object r1 = r11.A00
            X.4GW r1 = (X.AnonymousClass4GW) r1
            r0 = 0
            r1.AyY(r0)
            return
        L_0x02e5:
            java.lang.Object r2 = r11.A00     // Catch:{ ExecutionException -> 0x0301 }
            X.4Du r2 = (X.C84814Du) r2     // Catch:{ ExecutionException -> 0x0301 }
            r1 = 0
        L_0x02ea:
            java.lang.Object r0 = r3.get()     // Catch:{ InterruptedException -> 0x02ef, all -> 0x02fa }
            goto L_0x02f1
        L_0x02ef:
            r1 = 1
            goto L_0x02ea
        L_0x02f1:
            if (r1 == 0) goto L_0x02f6
            X.C18300x5.A11()     // Catch:{ ExecutionException -> 0x0301 }
        L_0x02f6:
            r2.BkD(r0)     // Catch:{ ExecutionException -> 0x0301 }
            return
        L_0x02fa:
            r0 = move-exception
            if (r1 == 0) goto L_0x0300
            X.C18300x5.A11()     // Catch:{ ExecutionException -> 0x0301 }
        L_0x0300:
            throw r0     // Catch:{ ExecutionException -> 0x0301 }
        L_0x0301:
            r0 = move-exception
            java.lang.Object r2 = r11.A00
            X.4Du r2 = (X.C84814Du) r2
            java.lang.Throwable r1 = r0.getCause()
            X.C162457s7.A0H(r1)
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            X.3Z0 r0 = X.AnonymousClass3Z0.A01(r1)
            r2.BkD(r0)
            return
        L_0x0319:
            r3 = 0
        L_0x031a:
            java.lang.Object r0 = r11.A00     // Catch:{ all -> 0x0320 }
            X.AnonymousClass0x9.A1K(r0)     // Catch:{ all -> 0x0320 }
            goto L_0x0326
        L_0x0320:
            r1 = move-exception
            X.3du r0 = X.C72553du.A00
            X.C1453575e.A00(r0, r1)
        L_0x0326:
            java.lang.Object r2 = r11.A01
            X.46E r2 = (X.AnonymousClass46E) r2
            java.lang.Runnable r0 = r2.A04()
            if (r0 == 0) goto L_0x034c
            r11.A00 = r0
            int r3 = r3 + 1
            r0 = 16
            if (r3 < r0) goto L_0x031a
            X.3gB r1 = r2.A02
            boolean r0 = r1.A03(r2)
            if (r0 == 0) goto L_0x031a
            r1.A01(r11, r2)
            return
        L_0x0344:
            r1 = move-exception
            r0 = 0
            r3.A74(r1, r4, r0, r0)
        L_0x0349:
            r0 = 1
            r3.A0A = r0
        L_0x034c:
            return
        L_0x034d:
            java.lang.Object r2 = r11.A00
            X.466 r2 = (X.AnonymousClass466) r2
            java.lang.Object r1 = r11.A01
            X.2wD r0 = X.C59022wD.A00
            r2.A01(r1, r0)
            return
        L_0x0359:
            java.lang.Object r0 = r11.A01
            X.8Tw r0 = (X.C174338Tw) r0
            org.npci.upi.security.pinactivitycomponent.s r1 = r0.A02
            java.lang.Object r0 = r11.A00
            X.7TF r0 = (X.AnonymousClass7TF) r0
            r1.A1J(r0)
            return
        L_0x0367:
            java.lang.Object r1 = r11.A00
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0371:
            java.lang.Object r8 = r11.A01
            X.3f7 r8 = (X.C73213f7) r8
            java.lang.Object r7 = r11.A00
            org.whispersystems.jobqueue.Job r7 = (org.whispersystems.jobqueue.Job) r7
            java.util.concurrent.atomic.AtomicInteger r6 = r8.A01
            r6.getAndIncrement()
            org.whispersystems.jobqueue.JobParameters r0 = r7.parameters
            int r3 = r0.retryCount
            int r2 = r7.A00
        L_0x0384:
            if (r2 >= r3) goto L_0x03aa
            r7.A07()     // Catch:{ Exception -> 0x038c }
            org.whispersystems.jobqueue.JobConsumer$JobResult r1 = org.whispersystems.jobqueue.JobConsumer$JobResult.SUCCESS     // Catch:{ Exception -> 0x038c }
            goto L_0x03ac
        L_0x038c:
            r1 = move-exception
            java.lang.String r0 = X.C73213f7.A04
            android.util.Log.w(r0, r1)
            boolean r0 = r1 instanceof java.lang.RuntimeException
            if (r0 != 0) goto L_0x03a9
            boolean r0 = r7.A06(r1)
            if (r0 == 0) goto L_0x03aa
            boolean r0 = r7.A03()
            int r2 = r2 + 1
            if (r0 != 0) goto L_0x0384
            r7.A00 = r2
            org.whispersystems.jobqueue.JobConsumer$JobResult r1 = org.whispersystems.jobqueue.JobConsumer$JobResult.DEFERRED
            goto L_0x03ac
        L_0x03a9:
            throw r1
        L_0x03aa:
            org.whispersystems.jobqueue.JobConsumer$JobResult r1 = org.whispersystems.jobqueue.JobConsumer$JobResult.FAILURE
        L_0x03ac:
            org.whispersystems.jobqueue.JobConsumer$JobResult r0 = org.whispersystems.jobqueue.JobConsumer$JobResult.DEFERRED
            if (r1 != r0) goto L_0x03bf
            X.2nb r0 = r8.A02
            r0.A02(r7)
        L_0x03b5:
            org.whispersystems.jobqueue.JobParameters r0 = r7.parameters
            java.lang.String r1 = r0.groupId
            if (r1 == 0) goto L_0x03f6
            X.2nb r7 = r8.A02
            monitor-enter(r7)
            goto L_0x03e5
        L_0x03bf:
            org.whispersystems.jobqueue.JobConsumer$JobResult r0 = org.whispersystems.jobqueue.JobConsumer$JobResult.FAILURE
            if (r1 != r0) goto L_0x03c6
            r7.A05()
        L_0x03c6:
            org.whispersystems.jobqueue.JobParameters r0 = r7.parameters
            boolean r0 = r0.isPersistent
            if (r0 == 0) goto L_0x03d3
            X.2xK r2 = r8.A03
            long r0 = r7.A01
            r2.A00(r0)
        L_0x03d3:
            android.os.PowerManager$WakeLock r5 = r7.A02
            if (r5 == 0) goto L_0x03b5
            org.whispersystems.jobqueue.JobParameters r0 = r7.parameters
            long r3 = r0.wakeLockTimeout
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x03b5
            r5.release()
            goto L_0x03b5
        L_0x03e5:
            java.util.Set r0 = r7.A03     // Catch:{ all -> 0x03f2 }
            r0.remove(r1)     // Catch:{ all -> 0x03f2 }
            X.3f6 r0 = r7.A05     // Catch:{ all -> 0x03f2 }
            android.os.ConditionVariable r0 = r0.A00     // Catch:{ all -> 0x03f2 }
            r0.open()     // Catch:{ all -> 0x03f2 }
            goto L_0x03f5
        L_0x03f2:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x03f5:
            monitor-exit(r7)
        L_0x03f6:
            r6.getAndDecrement()
            return
        L_0x03fa:
            java.lang.Object r1 = r11.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0 = 0
            android.os.Process.setThreadPriority(r0)
            r1.run()
            return
        L_0x0406:
            java.lang.String r0 = "MediaCodecVideoDecoder Java releaseDecoder on release thread"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0423 }
            java.lang.Object r1 = r11.A00     // Catch:{ Exception -> 0x0423 }
            org.wawebrtc.MediaCodecVideoDecoder r1 = (org.wawebrtc.MediaCodecVideoDecoder) r1     // Catch:{ Exception -> 0x0423 }
            android.media.MediaCodec r0 = r1.mediaCodec     // Catch:{ Exception -> 0x0423 }
            if (r0 == 0) goto L_0x0416
            r0.stop()     // Catch:{ Exception -> 0x0423 }
        L_0x0416:
            android.media.MediaCodec r0 = r1.mediaCodec     // Catch:{ Exception -> 0x0423 }
            if (r0 == 0) goto L_0x041d
            r0.release()     // Catch:{ Exception -> 0x0423 }
        L_0x041d:
            java.lang.String r0 = "MediaCodecVideoDecoder Java releaseDecoder on release thread done"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0446
        L_0x0423:
            r1 = move-exception
            java.lang.String r0 = "MediaCodecVideoDecoder Media decoder release failed"
            goto L_0x0443
        L_0x0427:
            java.lang.String r0 = "MediaCodecVideoEncoder Java releaseEncoder on release thread"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0440 }
            java.lang.Object r1 = r11.A00     // Catch:{ Exception -> 0x0440 }
            org.wawebrtc.MediaCodecVideoEncoder r1 = (org.wawebrtc.MediaCodecVideoEncoder) r1     // Catch:{ Exception -> 0x0440 }
            android.media.MediaCodec r0 = r1.mediaCodec     // Catch:{ Exception -> 0x0440 }
            r0.stop()     // Catch:{ Exception -> 0x0440 }
            android.media.MediaCodec r0 = r1.mediaCodec     // Catch:{ Exception -> 0x0440 }
            r0.release()     // Catch:{ Exception -> 0x0440 }
            java.lang.String r0 = "MediaCodecVideoEncoder Java releaseEncoder on release thread done"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0440 }
            goto L_0x0446
        L_0x0440:
            r1 = move-exception
            java.lang.String r0 = "MediaCodecVideoEncoder Media encoder release failed"
        L_0x0443:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0446:
            java.lang.Object r0 = r11.A01
            java.util.concurrent.CountDownLatch r0 = (java.util.concurrent.CountDownLatch) r0
            r0.countDown()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70163a3.run():void");
    }
}
