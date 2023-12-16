package X;

import android.content.Intent;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.speech.SpeechRecognizer;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;

/* renamed from: X.4uo  reason: invalid class name and case insensitive filesystem */
public class C95884uo extends C56482s3 {
    public ParcelFileDescriptor A00;
    public SpeechRecognizer A01;
    public String A02 = "";
    public boolean A03 = false;
    public final C64393Dh A04;
    public final C69263Wi A05;
    public final C54292oU A06;
    public final C620733j A07;
    public final C61072zf A08;
    public final AnonymousClass1VX A09;
    public final LinkedList A0A = AnonymousClass0x9.A18();

    public C95884uo(C64393Dh r3, C69263Wi r4, C54292oU r5, C620733j r6, C61072zf r7, AnonymousClass1VX r8, C69423Wy r9) {
        super(C72333dY.A06(new C107625bc(r9, 8)));
        this.A06 = r5;
        this.A09 = r8;
        this.A05 = r4;
        this.A07 = r6;
        this.A08 = r7;
        this.A04 = r3;
    }

    public /* bridge */ /* synthetic */ Runnable A07(Object obj, Object obj2) {
        AnonymousClass1I8 r2 = (AnonymousClass1I8) obj2;
        C626936e.A06(r2);
        return r2;
    }

    public final void A08() {
        LinkedList linkedList = this.A0A;
        if (!linkedList.isEmpty() && !this.A03) {
            AnonymousClass5SM r2 = (AnonymousClass5SM) linkedList.removeFirst();
            this.A03 = true;
            if (this.A01 == null) {
                if (Build.VERSION.SDK_INT < 31) {
                    this.A03 = false;
                } else {
                    SpeechRecognizer createOnDeviceSpeechRecognizer = SpeechRecognizer.createOnDeviceSpeechRecognizer(this.A06.A00);
                    this.A01 = createOnDeviceSpeechRecognizer;
                    createOnDeviceSpeechRecognizer.setRecognitionListener(new C109085e3(r2, this));
                }
            }
            if (this.A01 == null) {
                this.A03 = false;
                this.A03 = false;
                return;
            }
            try {
                this.A00 = ParcelFileDescriptor.open(r2.A01, 268435456);
                Intent A092 = AnonymousClass0x9.A09("android.speech.action.RECOGNIZE_SPEECH");
                A092.putExtra("android.speech.extra.SEGMENTED_SESSION", "android.speech.extra.AUDIO_SOURCE");
                A092.putExtra("android.speech.extra.AUDIO_SOURCE", this.A00);
                A092.putExtra("android.speech.extra.AUDIO_SOURCE_SAMPLING_RATE", 44100);
                A092.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
                A092.putExtra("android.speech.extra.LANGUAGE", C620733j.A02(this.A07));
                this.A01.startListening(A092);
            } catch (FileNotFoundException e) {
                Log.e((Throwable) e);
            }
        }
    }

    public final void A09(AnonymousClass5SM r2) {
        this.A0A.add(r2);
        A08();
    }

    public boolean A0A() {
        if (!this.A09.A0X(2890) || Build.VERSION.SDK_INT < 33) {
            return false;
        }
        return true;
    }

    public boolean A0B(C30721mu r5, C184608sD r6) {
        File file;
        AnonymousClass33C r0 = r5.A01;
        if (r0 == null || (file = r0.A0F) == null || Build.VERSION.SDK_INT < 33) {
            return false;
        }
        this.A02 = "";
        C132016eY r2 = new C132016eY(this.A04, this.A08, file);
        r2.A04(new C124256Bo(r5, this, r6, 1), this.A05.A08);
        A02(r5, r2);
        r6.BcG(r5);
        return true;
    }
}
