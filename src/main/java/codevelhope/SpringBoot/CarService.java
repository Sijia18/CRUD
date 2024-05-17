package codevelhope.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepo carRepo;

    public Car createCar(Car car) {
        return carRepo.save(car);
    }

    public List<Car> getAllCars() {
        return carRepo.findAll();
    }

    public Optional<Car> getCarById(Long id) {
        return carRepo.findById(id);
    }

    public Car updateCarType(Long id, String type) {
        Optional<Car> optionalCar = carRepo.findById(id);
        if (optionalCar.isPresent()) {
            Car car = optionalCar.get();
            return carRepo.save(car);
        }
        return new Car();
    }

    public boolean deleteCarById(Long id) {
        if (carRepo.existsById(id)) {
            carRepo.deleteById(id);
            return true;
        }
        return false;
    }

    public void deleteAllCars() {
        carRepo.deleteAll();
    }
}