package X;

import android.widget.SeekBar;
import com.whatsapp.textstatuscomposer.voice.VoiceRecordingView;

/* renamed from: X.69M  reason: invalid class name */
public class AnonymousClass69M implements SeekBar.OnSeekBarChangeListener {
    public Object A00;
    public final int A01;

    public AnonymousClass69M(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r2 = (com.whatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity) r3.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onProgressChanged(android.widget.SeekBar r4, int r5, boolean r6) {
        /*
            r3 = this;
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x000d;
                case 1: goto L_0x002a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r3.A00
            X.5ZT r0 = (X.AnonymousClass5ZT) r0
            X.AnonymousClass5ZT.A02(r0, r5, r6)
        L_0x000c:
            return
        L_0x000d:
            if (r4 == 0) goto L_0x000c
            if (r6 == 0) goto L_0x000c
            java.lang.Object r2 = r3.A00
            com.whatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity r2 = (com.whatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity) r2
            X.5QL r0 = r2.A0N
            if (r0 == 0) goto L_0x000c
            android.graphics.drawable.Drawable r1 = r0.A00
            if (r1 == 0) goto L_0x000c
            int r0 = r4.getProgress()
            X.AnonymousClass366.A05(r2, r1, r0)
            com.whatsapp.settings.chat.wallpaper.WallpaperImagePreview r0 = r2.A0O
            r0.setImageDrawable(r1)
            return
        L_0x002a:
            java.lang.Object r0 = r3.A00
            com.whatsapp.textstatuscomposer.voice.VoiceRecordingView r0 = (com.whatsapp.textstatuscomposer.voice.VoiceRecordingView) r0
            X.8je r1 = r0.A0D
            if (r1 == 0) goto L_0x000c
            com.whatsapp.voicerecorder.VoiceNoteSeekBar r0 = r0.A0F
            int r0 = r0.getProgress()
            X.5pr r1 = (X.C116175pr) r1
            r1.A02(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass69M.onProgressChanged(android.widget.SeekBar, int, boolean):void");
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        switch (this.A01) {
            case 0:
                return;
            case 1:
                VoiceRecordingView voiceRecordingView = (VoiceRecordingView) this.A00;
                C179748je r3 = voiceRecordingView.A0D;
                if (r3 != null) {
                    int progress = voiceRecordingView.A0F.getProgress();
                    C116175pr r32 = (C116175pr) r3;
                    AnonymousClass08M r1 = r32.A08;
                    Object A07 = r1.A07();
                    if (A07 != null) {
                        r32.A01 = (C150487Qx) A07;
                        r1.A0H(new C138006pc(r32));
                        AnonymousClass5ZQ r0 = r32.A02;
                        if (r0 != null) {
                            r0.A04();
                        }
                        r32.A04.removeCallbacks(r32.A03);
                        r32.A02(progress, false);
                    } else {
                        throw C18300x5.A0X();
                    }
                }
                voiceRecordingView.setupPreviewProgressIndicatorSizes(true);
                return;
            default:
                AnonymousClass5ZT r5 = (AnonymousClass5ZT) this.A00;
                r5.A1G.A02++;
                if (r5.A0K != null) {
                    r5.A0T.removeCallbacks(r5.A1P);
                    r5.A04 = -1;
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStopTrackingTouch(android.widget.SeekBar r6) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x000d;
                case 1: goto L_0x002b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r5.A00
            X.5ZT r0 = (X.AnonymousClass5ZT) r0
            X.AnonymousClass5ZT.A01(r0)
        L_0x000c:
            return
        L_0x000d:
            if (r6 == 0) goto L_0x000c
            int r3 = r6.getProgress()
            java.lang.Object r2 = r5.A00
            com.whatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity r2 = (com.whatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity) r2
            android.content.Intent r1 = r2.getIntent()
            java.lang.String r0 = "chat_jid"
            java.lang.String r0 = r1.getStringExtra(r0)
            X.4uZ r1 = X.C18310x6.A0S(r0)
            X.34u r0 = r2.A0M
            r0.A0E(r2, r1, r3)
            return
        L_0x002b:
            java.lang.Object r3 = r5.A00
            com.whatsapp.textstatuscomposer.voice.VoiceRecordingView r3 = (com.whatsapp.textstatuscomposer.voice.VoiceRecordingView) r3
            X.8je r2 = r3.A0D
            if (r2 == 0) goto L_0x000c
            com.whatsapp.voicerecorder.VoiceNoteSeekBar r0 = r3.A0F
            int r1 = r0.getProgress()
            X.5pr r2 = (X.C116175pr) r2
            r0 = 1
            r2.A02(r1, r0)
            X.7Qx r1 = r2.A01
            if (r1 == 0) goto L_0x00dc
            boolean r0 = r1 instanceof X.C138006pc
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = "VoiceRecordingPreviewController: previous state before dragging is dragging"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x004c:
            X.52c r4 = new X.52c
            r4.<init>(r2)
        L_0x0051:
            boolean r0 = r4 instanceof X.C138006pc
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = "VoiceRecordingPreviewController: nextState is Dragging. This should never happen."
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x005a:
            X.08M r0 = r2.A08
            r0.A0H(r4)
            r0 = 0
            r3.setupPreviewProgressIndicatorSizes(r0)
            return
        L_0x0064:
            boolean r0 = r4 instanceof X.C985852b
            if (r0 != 0) goto L_0x005a
            boolean r0 = r4 instanceof X.AnonymousClass52c
            if (r0 == 0) goto L_0x0087
            X.5ZQ r1 = r2.A02
            if (r1 == 0) goto L_0x007f
            X.08M r0 = r2.A07
            java.lang.Object r0 = r0.A07()
            if (r0 == 0) goto L_0x00cd
            int r0 = X.AnonymousClass001.A0K(r0)
            r1.A0A(r0)
        L_0x007f:
            android.os.Handler r1 = r2.A04
            java.lang.Runnable r0 = r2.A03
            r1.post(r0)
            goto L_0x005a
        L_0x0087:
            boolean r0 = r4 instanceof X.C138016pd
            if (r0 == 0) goto L_0x005a
            android.os.Handler r1 = r2.A04
            java.lang.Runnable r0 = r2.A03
            r1.post(r0)
            X.5ZQ r1 = r2.A02
            if (r1 == 0) goto L_0x00a5
            X.08M r0 = r2.A07
            java.lang.Object r0 = r0.A07()
            if (r0 == 0) goto L_0x00d2
            int r0 = X.AnonymousClass001.A0K(r0)
            r1.A0A(r0)
        L_0x00a5:
            X.5ZQ r0 = r2.A02
            if (r0 == 0) goto L_0x00ac
            r0.A07()
        L_0x00ac:
            X.5Td r1 = r2.A0I
            r0 = 2131892619(0x7f12198b, float:1.9419991E38)
            r1.A02(r0)
            goto L_0x005a
        L_0x00b5:
            boolean r0 = r1 instanceof X.C985852b
            if (r0 == 0) goto L_0x00bf
            X.52b r4 = new X.52b
            r4.<init>(r2)
            goto L_0x0051
        L_0x00bf:
            boolean r0 = r1 instanceof X.AnonymousClass52c
            if (r0 != 0) goto L_0x004c
            boolean r0 = r1 instanceof X.C138016pd
            if (r0 == 0) goto L_0x00d7
            X.6pd r4 = new X.6pd
            r4.<init>(r2)
            goto L_0x0051
        L_0x00cd:
            java.lang.IllegalArgumentException r0 = X.C18300x5.A0X()
            throw r0
        L_0x00d2:
            java.lang.IllegalArgumentException r0 = X.C18300x5.A0X()
            throw r0
        L_0x00d7:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x00dc:
            java.lang.IllegalArgumentException r0 = X.C18300x5.A0X()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass69M.onStopTrackingTouch(android.widget.SeekBar):void");
    }
}
