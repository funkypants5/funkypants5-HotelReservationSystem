/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package ejb.session.stateless;

import entity.RoomRateEntity;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author admin
 */
@Local
public interface RoomRateSessionBeanLocal {
    Long createRoomRate(RoomRateEntity roomRate);
    RoomRateEntity retrieveRoomRateById(Long roomRateId);
    List<RoomRateEntity> retrieveAllRoomRates();
    void updateRoomRate(RoomRateEntity roomRate);
    void deleteRoomRate(Long roomRateId);
}