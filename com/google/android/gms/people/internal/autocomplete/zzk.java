package com.google.android.gms.people.internal.autocomplete;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzk implements Creator<NameImpl> {
    static void zza(NameImpl nameImpl, Parcel parcel, int i) {
        int zzbe = zzb.zzbe(parcel);
        zzb.zzc(parcel, 1, nameImpl.mVersionCode);
        zzb.zza(parcel, 2, nameImpl.zzVA, false);
        zzb.zzJ(parcel, zzbe);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzjD(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zznH(i);
    }

    public NameImpl zzjD(Parcel parcel) {
        int zzbd = zza.zzbd(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < zzbd) {
            int zzbc = zza.zzbc(parcel);
            switch (zza.zzdr(zzbc)) {
                case 1:
                    i = zza.zzg(parcel, zzbc);
                    break;
                case 2:
                    str = zza.zzq(parcel, zzbc);
                    break;
                default:
                    zza.zzb(parcel, zzbc);
                    break;
            }
        }
        if (parcel.dataPosition() == zzbd) {
            return new NameImpl(i, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzbd, parcel);
    }

    public NameImpl[] zznH(int i) {
        return new NameImpl[i];
    }
}
