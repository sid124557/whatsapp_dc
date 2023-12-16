package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1bd  reason: invalid class name and case insensitive filesystem */
public class C26131bd extends C56392ru {
    public boolean A00 = false;
    public final C53842nl A01;
    public final String A02;

    public C26131bd(C380625j r9, AnonymousClass33p r10, C56092rP r11, AnonymousClass2SH r12, C26071bX r13, RandomAccessFile randomAccessFile, String str, int i) {
        super(r9, r12, r13, randomAccessFile, i, 2);
        this.A01 = new C53842nl(r10, r11, r13);
        this.A02 = str;
    }

    public void A04(List list) {
        int i;
        C53842nl r7 = this.A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int A05 = C18280x3.A05(it);
            if (A05 < 1000) {
                int i2 = A05 / 8;
                int i3 = A05 % 8;
                Iterator A0u = AnonymousClass001.A0u(r7.A02);
                while (true) {
                    if (!A0u.hasNext()) {
                        break;
                    }
                    C60262yG r2 = (C60262yG) AnonymousClass0x2.A0W(A0u);
                    if (i2 == r2.A05) {
                        ArrayList arrayList = r2.A04;
                        AnonymousClass0x9.A0P(arrayList, i3).A01 = 8;
                        AnonymousClass0x9.A0P(arrayList, i3).A02 = false;
                        try {
                            RandomAccessFile randomAccessFile = r2.A07;
                            randomAccessFile.seek((long) ((i3 * 9) + 56));
                            randomAccessFile.writeInt(8);
                            randomAccessFile.skipBytes(4);
                            randomAccessFile.writeBoolean(false);
                            break;
                        } catch (IOException e) {
                            C18260x0.A16("queuefile/dropsentdata ", AnonymousClass001.A0o(), e);
                        }
                    }
                }
            }
        }
        int i4 = 0;
        do {
            boolean[] zArr = r7.A04;
            if (zArr[i4]) {
                HashMap hashMap = r7.A02;
                Iterator A0u2 = AnonymousClass001.A0u(hashMap);
                while (true) {
                    if (!A0u2.hasNext()) {
                        break;
                    }
                    Map.Entry A0w = AnonymousClass001.A0w(A0u2);
                    C60262yG r10 = (C60262yG) A0w.getValue();
                    Object key = A0w.getKey();
                    if (r10.A05 == i4) {
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            i = r10.A01;
                            if (i5 >= i) {
                                break;
                            }
                            if (AnonymousClass0x9.A0P(r10.A04, i5).A01 <= 8) {
                                i6++;
                            }
                            i5++;
                        }
                        if (i6 == i) {
                            try {
                                r10.A07.close();
                            } catch (IOException e2) {
                                C18260x0.A16("queuefile/flush failed to close file ", AnonymousClass001.A0o(), e2);
                            }
                            zArr[i4] = false;
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append(r7.A01);
                            try {
                                AnonymousClass002.A0B(AnonymousClass000.A0Y("wampsid", A0o, i4)).delete();
                            } catch (Exception e3) {
                                C18260x0.A1O(AnonymousClass001.A0o(), "psuploadqueue/dropSentData failed to delete closed queue file ", e3);
                            }
                            hashMap.remove(key);
                        }
                    }
                }
            }
            i4++;
        } while (i4 < 8);
        C18270x1.A0f(C18270x1.A03(r7.A05), "events_ps_phase3_migration_done");
        C56132rT A012 = A01(1);
        if (this.A00) {
            ByteBuffer asReadOnlyBuffer = A012.A05.A05.asReadOnlyBuffer();
            asReadOnlyBuffer.flip();
            if (asReadOnlyBuffer.limit() > 0) {
                A07(asReadOnlyBuffer, false);
            }
            this.A00 = false;
        }
        try {
            A012.A01();
            A012.A02();
        } catch (IOException e4) {
            C18260x0.A1O(AnonymousClass001.A0o(), "privatestatseventbuffermanager/dropsentdata: ioexception while flushing back buffer", e4);
        }
    }

    public void A07(ByteBuffer byteBuffer, boolean z) {
        StringBuilder sb;
        String str;
        int i;
        boolean A022;
        ByteBuffer byteBuffer2 = byteBuffer;
        int limit = byteBuffer2.limit();
        C53842nl r8 = this.A01;
        r8.A03 = new byte[10240];
        r8.A00 = 0;
        byteBuffer2.position(0);
        byteBuffer2.position(C59672xI.A06.length);
        byte[] bArr = new byte[EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH];
        try {
            int position = byteBuffer2.position();
            String str2 = null;
            boolean z2 = false;
            int i2 = 0;
            boolean z3 = false;
            int i3 = 0;
            while (true) {
                if (position < limit) {
                    AnonymousClass2O5 A03 = C625335l.A03(byteBuffer2);
                    int i4 = A03.A01;
                    if (i4 == 0) {
                        if (A03.A00 == 6005) {
                            str2 = (String) A03.A02;
                            int position2 = byteBuffer2.position() - position;
                            byteBuffer2.position(position);
                            byteBuffer2.get(bArr, 0, position2);
                            z2 = r8.A02(str2, bArr, position2);
                        } else {
                            int position3 = byteBuffer2.position() - position;
                            byteBuffer2.position(position);
                            byteBuffer2.get(bArr, 0, position3);
                            Iterator A0u = AnonymousClass001.A0u(r8.A02);
                            while (A0u.hasNext()) {
                                ((C60262yG) AnonymousClass0x2.A0W(A0u)).A01(bArr, position3);
                            }
                            if (position3 > 2048) {
                                position3 = EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                            }
                            int i5 = r8.A00;
                            if (position3 > 10240 - i5) {
                                Log.e("privatestatsuploadqueue/writetoCommonAttrBuffer too many common attributes");
                                z2 = false;
                            } else {
                                System.arraycopy(bArr, 0, r8.A03, i5, position3);
                                r8.A00 += position3;
                                z2 = true;
                            }
                        }
                        i2 = position;
                    } else {
                        if (i4 == 1) {
                            i = byteBuffer2.position();
                            if ((byteBuffer2.get(position) & 4) != 0) {
                                int i6 = i - position;
                                byteBuffer2.position(position);
                                byteBuffer2.get(bArr, 0, i6);
                                A022 = r8.A02(str2, bArr, i6);
                            } else {
                                i3 = position;
                                z3 = true;
                            }
                        } else if (i4 == 2 && (byteBuffer2.get(position) & 4) != 0 && z3) {
                            i = byteBuffer2.position();
                            int i7 = i - i3;
                            byteBuffer2.position(i3);
                            if (i7 <= 2048) {
                                byteBuffer2.get(bArr, 0, i7);
                                A022 = r8.A02(str2, bArr, i7);
                            } else {
                                byte[] bArr2 = new byte[i7];
                                byteBuffer2.get(bArr2, 0, i7);
                                A022 = r8.A02(str2, bArr2, i7);
                            }
                        }
                        byteBuffer2.position(i);
                        i2 = i3;
                        z3 = false;
                    }
                    if (!z2) {
                        break;
                    }
                    position = byteBuffer2.position();
                } else if (z2) {
                    r8.A03 = null;
                    r8.A00 = 0;
                    return;
                }
            }
            if (!z) {
                r8.A03 = null;
                r8.A00 = 0;
            } else {
                C56132rT A012 = A01(1);
                try {
                    int i8 = r8.A00;
                    if (i8 > 0) {
                        A012.A04(r8.A03, i8);
                        r8.A03 = null;
                        r8.A00 = 0;
                    }
                    int limit2 = byteBuffer2.limit() - i2;
                    byteBuffer2.position(i2);
                    if (limit2 <= 2048) {
                        byteBuffer2.get(bArr, 0, limit2);
                        A012.A04(bArr, limit2);
                    } else {
                        byte[] bArr3 = new byte[limit2];
                        byteBuffer2.get(bArr3, 0, limit2);
                        A012.A04(bArr3, limit2);
                    }
                    try {
                        A012.A02();
                        this.A00 = true;
                        return;
                    } catch (IOException e) {
                        C18260x0.A1O(AnonymousClass001.A0o(), "privatestatseventbuffermanager/splitBuffer: ioexception while flushing back buffer", e);
                        return;
                    }
                } catch (IndexOutOfBoundsException e2) {
                    C18260x0.A1O(AnonymousClass001.A0o(), "privatestatseventbuffermanager/splitBuffer: unexpected runtime exception when writing to back buffer ", e2);
                    try {
                        A012.A01();
                        A012.A02();
                    } catch (Exception e3) {
                        C18260x0.A1O(AnonymousClass001.A0o(), "privatestatseventbuffermanager/splitBuffer see exception when clearing the back buffer ", e3);
                    }
                }
            }
            this.A00 = false;
        } catch (C375523b e4) {
            th = e4;
            sb = AnonymousClass001.A0o();
            str = "privatestatseventbuffermanager/splitbuffer invalid buf content";
            C18260x0.A1O(sb, str, th);
        } catch (Throwable th) {
            th = th;
            sb = AnonymousClass001.A0o();
            str = "privateStatseventbuffermanager/splitbuffer unexpected errors ";
            C18260x0.A1O(sb, str, th);
        }
    }

    public void A02() {
        super.A02();
        this.A01.A00(this.A02);
    }

    public void A03() {
        super.A03();
        this.A01.A00(this.A02);
    }
}
