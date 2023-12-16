package X;

import android.content.BroadcastReceiver;

/* renamed from: X.67N  reason: invalid class name */
public class AnonymousClass67N extends BroadcastReceiver {
    public Object A00;
    public final int A01;

    public AnonymousClass67N(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009d, code lost:
        com.whatsapp.util.Log.i(r0);
        ((com.whatsapp.gallery.MediaGalleryFragmentBase) r5.A00).A1T(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b2, code lost:
        com.whatsapp.util.Log.i(r0);
        ((com.whatsapp.gallery.MediaGalleryFragmentBase) r5.A00).A1T(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bd, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x003e;
                case 1: goto L_0x00ea;
                case 2: goto L_0x006b;
                case 3: goto L_0x00cc;
                case 4: goto L_0x0115;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = r7.getAction()
            if (r0 == 0) goto L_0x0037
            java.lang.String r1 = r7.getAction()
            java.lang.String r0 = "android.location.PROVIDERS_CHANGED"
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.Object r4 = r5.A00
            X.5i6 r4 = (X.C111445i6) r4
            X.7ky r0 = r4.A0x
            boolean r3 = r0.A07()
            boolean r0 = r4.A0q
            if (r0 == r3) goto L_0x0037
            r4.A0q = r3
            X.2pX r0 = r4.A0n
            r1 = 0
            if (r0 == 0) goto L_0x0032
            if (r3 == 0) goto L_0x0038
            r0 = 1
            r4.A0p = r0
        L_0x0032:
            r4.A0D = r1
            r4.A0J()
        L_0x0037:
            return
        L_0x0038:
            r0.A05 = r1
            r4.A0I()
            goto L_0x0032
        L_0x003e:
            java.lang.String r0 = "android.intent.action.USER_PRESENT"
            boolean r0 = X.C18280x3.A1V(r7, r0)
            if (r0 == 0) goto L_0x0037
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r3 == 0) goto L_0x0037
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x0037
            java.lang.Object r2 = r5.A00
            X.5b3 r2 = (X.C107285b3) r2
            X.8uP r0 = r2.A0X
            if (r0 == 0) goto L_0x0060
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            boolean r0 = r0.A2F
            if (r0 != 0) goto L_0x0037
        L_0x0060:
            java.lang.String r0 = "voip/unlockReceiver generate headsup notification when user unlock the screen in RECEIVED_CALL state"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 1
            r0 = 0
            r2.A0d(r3, r1, r0, r0)
            return
        L_0x006b:
            r2 = 1
            X.C162457s7.A0J(r7, r2)
            java.lang.String r1 = r7.getAction()
            if (r1 == 0) goto L_0x0037
            int r0 = r1.hashCode()
            switch(r0) {
                case -1514214344: goto L_0x00be;
                case -1142424621: goto L_0x00a8;
                case -963871873: goto L_0x0093;
                case -625887599: goto L_0x0088;
                case 1412829408: goto L_0x007d;
                default: goto L_0x007c;
            }
        L_0x007c:
            return
        L_0x007d:
            java.lang.String r0 = "android.intent.action.MEDIA_SCANNER_STARTED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_SCANNER_STARTED"
            goto L_0x00b2
        L_0x0088:
            java.lang.String r0 = "android.intent.action.MEDIA_EJECT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_EJECT"
            goto L_0x009d
        L_0x0093:
            java.lang.String r0 = "android.intent.action.MEDIA_UNMOUNTED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_UNMOUNTED"
        L_0x009d:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r0 = r5.A00
            com.whatsapp.gallery.MediaGalleryFragmentBase r0 = (com.whatsapp.gallery.MediaGalleryFragmentBase) r0
            r0.A1T(r2)
            return
        L_0x00a8:
            java.lang.String r0 = "android.intent.action.MEDIA_SCANNER_FINISHED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_SCANNER_FINISHED"
        L_0x00b2:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r5.A00
            com.whatsapp.gallery.MediaGalleryFragmentBase r1 = (com.whatsapp.gallery.MediaGalleryFragmentBase) r1
            r0 = 0
            r1.A1T(r0)
            return
        L_0x00be:
            java.lang.String r0 = "android.intent.action.MEDIA_MOUNTED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_MOUNTED"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x00cc:
            java.lang.String r0 = "AppAsyncInit/BroadcastReceiver/android.intent.action.TIME_SET/received"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.lang.Object r2 = r5.A00
            X.2dU r2 = (X.C47582dU) r2
            X.5XU r1 = r2.A02
            r0 = 0
            r1.A00 = r0
            boolean r0 = r1.A03()
            if (r0 != 0) goto L_0x0037
            X.33T r2 = r2.A09
            r1 = 8
            java.lang.String r0 = "Roadblocks"
            r2.A05(r1, r0)
            return
        L_0x00ea:
            java.lang.Object r2 = r5.A00     // Catch:{ Exception -> 0x010e }
            X.5l7 r2 = (X.C113245l7) r2     // Catch:{ Exception -> 0x010e }
            X.676 r0 = r2.A2z     // Catch:{ Exception -> 0x010e }
            r0.unregisterReceiver(r5)     // Catch:{ Exception -> 0x010e }
            java.lang.String r0 = "conversation/reset-ime"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x010e }
            X.676 r0 = r2.A2z     // Catch:{ Exception -> 0x010e }
            X.33i r0 = r0.getSystemServices()     // Catch:{ Exception -> 0x010e }
            android.view.inputmethod.InputMethodManager r1 = r0.A0Q()     // Catch:{ Exception -> 0x010e }
            X.C626936e.A06(r1)     // Catch:{ Exception -> 0x010e }
            com.whatsapp.mentions.MentionableEntry r0 = r2.A4P     // Catch:{ Exception -> 0x010e }
            r1.restartInput(r0)     // Catch:{ Exception -> 0x010e }
            r0 = 0
            r2.A09 = r0     // Catch:{ Exception -> 0x010e }
            return
        L_0x010e:
            r1 = move-exception
            java.lang.String r0 = "conversation/unregister user present receiver "
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0115:
            java.lang.String r0 = "AppAsyncInit/BroadcastReceiver/android.intent.action.TIMEZONE_CHANGED/received"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r0 = 0
            X.C107505bQ.A00 = r0
            X.C107505bQ.A01 = r0
            X.C107505bQ.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass67N.onReceive(android.content.Context, android.content.Intent):void");
    }
}
